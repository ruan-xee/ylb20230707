package com.rxee.dataservice.mapper;

import com.rxee.api.entity.ProductInfo;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;

public interface ProductInfoMapper {

    // 查询平均利率
    BigDecimal selectAvgRate();

    List<ProductInfo> selectByTypeLimit(int pType, int offset, int pageSize);
}
