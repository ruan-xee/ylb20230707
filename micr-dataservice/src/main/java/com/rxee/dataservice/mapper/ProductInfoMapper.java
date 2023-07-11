package com.rxee.dataservice.mapper;

import com.rxee.api.entity.ProductInfo;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;

public interface ProductInfoMapper {

    // 查询平均利率
    BigDecimal selectAvgRate();
}
