package com.rxee.dataservice.mapper;

import com.rxee.api.entity.BidInfo;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;

public interface BidInfoMapper {

    // 查询成交总金额
    BigDecimal selectSumBidMoney();
}
