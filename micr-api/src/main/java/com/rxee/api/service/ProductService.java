package com.rxee.api.service;

import com.rxee.api.dto.MultiProduct;
import com.rxee.api.entity.ProductInfo;

import java.util.List;

public interface ProductService {
    /**
     * 根据产品类型，查询产品，支持分页
     * @param pType
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<ProductInfo> queryByTypeLimit(Integer pType, Integer pageNum, Integer pageSize);

    /**
     * 首页多个产品数据
     * @return
     */
    MultiProduct queryIndexPageProducts();

    /**
     * 某个产品类型的总记录数
     */
    Integer queryRecordNumsByType(Integer pType);
}
