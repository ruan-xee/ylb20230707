package com.rxee.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class BidInfoProduct implements Serializable {

    private static final long serialVersionUID = 4932699945060454395L;

    private String id;
    private String phone;
    private BigDecimal bidMoney;
    private String bidTime;
}
