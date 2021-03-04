package com.young.vo;

import com.young.entity.Product;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author LiuYang
 * @Date 2021/3/4 9:18
 */
@Data
public class ProductVO implements Serializable {

    private Product product;

    private String productDesc;
}
