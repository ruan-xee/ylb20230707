package com.rxee.front.controller;

import com.rxee.api.dto.MultiProduct;
import com.rxee.front.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
