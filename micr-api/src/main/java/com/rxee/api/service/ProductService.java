package com.rxee.api.service;

import com.rxee.api.dto.MultiProduct;
import com.rxee.api.entity.ProductInfo;

import java.util.List;

public interface ProductService {
    public List<ProductInfo> queryByTypeLimit(Integer pType, Integer pageNum, Integer pageSize);

    MultiProduct queryIndexPageProducts();
}
