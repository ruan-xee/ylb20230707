package com.rxee.api.service;

import com.rxee.api.entity.BidInfoProduct;

import java.util.List;

public interface InvestService {
    /**
     * 查询某个产品的投资记录
     */
    List<BidInfoProduct> queryBidListByProductId(Integer productId, Integer pageNum, Integer pageSize);
}
