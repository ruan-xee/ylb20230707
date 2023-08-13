package com.rxee.dataservice.service;

import com.rxee.api.dto.MultiProduct;
import com.rxee.api.entity.ProductInfo;
import com.rxee.api.service.ProductService;
import com.rxee.common.constant.YLBConstant;
import com.rxee.common.util.CommonUtil;
import com.rxee.dataservice.mapper.ProductInfoMapper;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@DubboService(interfaceClass = ProductService.class, version = "1.0")
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> queryByTypeLimit(Integer pType, Integer pageNum, Integer pageSize) {
        List<ProductInfo> productInfos = new ArrayList<>();
        if (pType <= 2 && pType >= 0) {
            pageNum = CommonUtil.defaultPageNum(pageNum);
            pageSize = CommonUtil.defaltPageSize(pageSize);
            int offset = (pageNum - 1) * pageSize;
            productInfos = productInfoMapper.selectByTypeLimit(pType, offset, pageSize);
        }
        return productInfos;
    }

    @Override
    public MultiProduct queryIndexPageProducts() {
        MultiProduct result = new MultiProduct();
        List<ProductInfo> list = productInfoMapper.selectByTypeLimit(YLBConstant.PRODUCT_TYPE_XINSHOUBAO, 0, 1);
        List<ProductInfo> list2 = productInfoMapper.selectByTypeLimit(YLBConstant.PRODUCT_TYPE_YOUXUAN, 0, 3);
        List<ProductInfo> list3 = productInfoMapper.selectByTypeLimit(YLBConstant.PRODUCT_TYPE_SANBIAO, 0, 3);
        result.setXinShouBao(list);
        result.setYouXuan(list2);
        result.setSanBiao(list3);
        return result;
    }

    @Override
    public Integer queryRecordNumsByType(Integer pType) {
        Integer count = 0;
        if (pType <= 2 && pType >= 0) {
            count = productInfoMapper.selectCountByType(pType);
        }
        return count;
    }

    @Override
    public ProductInfo queryById(Integer id) {
        return productInfoMapper.selectProductById(id);
    }
}
