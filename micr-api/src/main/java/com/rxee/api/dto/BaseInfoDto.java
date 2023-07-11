package com.rxee.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseInfoDto implements Serializable {
    private static final long serialVersionUID = 3717590009844516584L;
    // 收益率平均值
    private BigDecimal historyAvgRate;

    // 累计成交金额
    private BigDecimal sumBidMoney;

    // 平台注册用户数
    private int registerUser;
}
