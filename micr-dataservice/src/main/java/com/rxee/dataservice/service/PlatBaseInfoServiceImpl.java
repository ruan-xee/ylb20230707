package com.rxee.dataservice.service;

import com.rxee.api.dto.BaseInfo;
import com.rxee.api.service.PlatBaseInfoService;
import com.rxee.dataservice.mapper.BidInfoMapper;
import com.rxee.dataservice.mapper.ProductInfoMapper;
import com.rxee.dataservice.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.math.BigDecimal;


@DubboService(interfaceClass = PlatBaseInfoService.class, version = "1.0")
public class PlatBaseInfoServiceImpl implements PlatBaseInfoService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Resource
    private BidInfoMapper bidInfoMapper;
    // 平台基本信息
    @Override
    public BaseInfo queryPlatBaseInfo() {

        Integer countUser = userMapper.selectCountUser();
        BigDecimal avgRate = productInfoMapper.selectAvgRate();
        BigDecimal sumBidMoney = bidInfoMapper.selectSumBidMoney();
        return new BaseInfo(avgRate, sumBidMoney, countUser);
    }
}
