package com.rxee.front.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 排行榜vo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankVo implements Serializable {
    private String phone;
    private BigDecimal money;
}
