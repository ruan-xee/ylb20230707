package com.rxee.api.dto;

import com.rxee.api.entity.ProductInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MultiProduct implements Serializable {

    private static final long serialVersionUID = -4411726054901351434L;
    private List<ProductInfo> xinShouBao;
    private List<ProductInfo> youXuan;
    private List<ProductInfo> sanBiao;
}
