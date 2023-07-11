package com.rxee.front.controller;


import com.rxee.api.service.PlatBaseInfoService;
import com.rxee.api.service.ProductService;
import org.apache.dubbo.config.annotation.DubboReference;

public class BaseController {
    // 声明公共的方法，属性等

    @DubboReference(interfaceClass = PlatBaseInfoService.class, version = "1.0")
    protected PlatBaseInfoService platBaseInfoService;

    @DubboReference(interfaceClass = ProductService.class, version = "1.0")
    protected ProductService productService;
}
