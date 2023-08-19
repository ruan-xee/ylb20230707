package com.rxee.dataservice.service;

import com.rxee.api.entity.BidInfoProduct;
import com.rxee.api.service.InvestService;
import com.rxee.common.util.CommonUtil;
import com.rxee.dataservice.mapper.BidInfoMapper;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@DubboService(interfaceClass = InvestService.class, version = "1.0")
public class InvestServiceImpl implements InvestService {
    @Resource
    private BidInfoMapper bidInfoMapper;
    /**
     * 查询某个产品的投资记录
     */
    @Override
    public List<BidInfoProduct> queryBidListByProductId(Integer productId, Integer pageNum, Integer pageSize) {
        List<BidInfoProduct> bidInfoProducts = new ArrayList<>();
        if (Objects.nonNull(productId) && productId > 0) {
            pageNum = CommonUtil.defaultPageNum(pageNum);
            pageSize = CommonUtil.defaltPageSize(pageSize);
            int offset = (pageNum - 1) * pageSize;
            bidInfoProducts = bidInfoMapper.selectByProductId(productId, offset, pageSize);
        }
        return bidInfoProducts;
    }
}
