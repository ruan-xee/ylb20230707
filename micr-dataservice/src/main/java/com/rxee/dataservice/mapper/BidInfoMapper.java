package com.rxee.dataservice.mapper;

import com.rxee.api.entity.BidInfoProduct;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface BidInfoMapper {

    /** 查询成交总金额 */
    BigDecimal selectSumBidMoney();

    /** 某个产品的投资记录 */
    List<BidInfoProduct> selectByProductId(@Param("prodId") Integer prodId,
                                           @Param("offset") Integer offset,
                                           @Param("pageSize") Integer pageSize);
}
