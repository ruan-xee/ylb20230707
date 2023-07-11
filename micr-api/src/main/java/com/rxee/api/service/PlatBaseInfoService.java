package com.rxee.api.service;

import com.rxee.api.dto.BaseInfoDto;

public interface PlatBaseInfoService {
    /* 计算利率，注册人数，累计成交金额 */
    BaseInfoDto queryPlatBaseInfo();
}
