package com.rxee.front.controller;

import com.rxee.api.dto.MultiProduct;
import com.rxee.api.entity.BidInfoProduct;
import com.rxee.api.entity.ProductInfo;
import com.rxee.common.util.CommonUtil;
import com.rxee.front.pageInfo.PageInfo;
import com.rxee.front.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@Api(tags = "产品相关功能")
@RestController
@RequestMapping("/v1/product")
public class ProductController extends BaseController {

    @ApiOperation(value = "首页三种类型的最新产品列表", notes = "一个新手宝，三个优选，三个散标")
    @GetMapping("/index")
    public ResultVo queryProductIndex() {

        MultiProduct multiProduct = productService.queryIndexPageProducts();
        return ResultVo.success(multiProduct);
    }

    @ApiOperation(value = "产品分页查询", notes = "按产品类型分页查找对应产品信息")
    @GetMapping("/list")
    public ResultVo queryProductByType(@RequestParam("pType") Integer pType,
                                       @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                       @RequestParam(value = "pageSize", required = false, defaultValue = "9") Integer pageSize) {
        if (pType != null && (pType >= 0 && pType <= 2)) {
            pageNum = CommonUtil.defaultPageNum(pageNum);
            pageSize = CommonUtil.defaltPageSize(pageSize);
            // 分页处理，记录总数
            Integer recordNums = productService.queryRecordNumsByType(pType);
            if (recordNums > 0) {
                // 查询到的产品集合
                List<ProductInfo> productInfos = productService.queryByTypeLimit(pType, pageNum, pageSize);
                ResultVo resultVo = ResultVo.success();
                resultVo.setList(productInfos);
                PageInfo page = new PageInfo(pageNum, pageSize, recordNums);
                resultVo.setPage(page);
                return resultVo;
            }
        } else {
            return ResultVo.fail_400();
        }
        return ResultVo.fail_204();
    }

    /** 查询某个产品的详情以及投资记录 */
    @ApiOperation(value = "产品详情", notes = "通过产品id查询产品详情和产品投资记录")
    @GetMapping("/info")
    public ResultVo queryProductById(@RequestParam("productId") Integer productId) {
        ResultVo resultVo = ResultVo.fail_400();
        if (Objects.nonNull(productId) && productId > 0) {
            // 查询产品信息
            ProductInfo productInfo = productService.queryById(productId);
            if (productInfo != null) {
                // 查询投资记录
                List<BidInfoProduct> bidInfoList = investService.queryBidListByProductId(productId, 1, 5);
                resultVo = ResultVo.success();
                resultVo.setData(productInfo);
                resultVo.setList(bidInfoList);
            } else {
                resultVo = ResultVo.fail_204();
            }
        }
        return resultVo;
    }
}
