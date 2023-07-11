package com.rxee.front.controller;

import com.rxee.api.dto.MultiProduct;
import com.rxee.common.util.CommonUtil;
import com.rxee.front.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "产品相关功能")
@RestController
@RequestMapping("/v1")
public class ProductController extends BaseController{

    @ApiOperation(value = "首页三种类型的最新产品列表", notes = "一个新手宝，三个优选，三个散标")
    @GetMapping("/product/index")
    public ResultVo queryProductIndex() {

        MultiProduct multiProduct = productService.queryIndexPageProducts();
        return ResultVo.success(multiProduct);
    }

    @GetMapping("/product/list")
    public ResultVo queryProductByType(@RequestParam("pType") Integer pType,
                                       @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                       @RequestParam(value = "pageSize", required = false, defaultValue = "9") Integer pageSize) {
        if (pType != null && (pType >= 0 && pType <= 2)) {
            pageNum = CommonUtil.defaultPageNum(pageNum);
            pageSize = CommonUtil.defaltPageSize(pageSize);
        } else {
            return ResultVo.fail_400();
        }
        return ResultVo.success();
    }
}
