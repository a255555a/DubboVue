package com.young.v10productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.api.IProductService;
import com.young.base.BaseServiceImpl;
import com.young.base.IBaseDao;
import com.young.entity.Product;
import com.young.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author LiuYang
 * @Date 2021/3/2 16:23
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public IBaseDao<Product> getbaseDao() {
        return productMapper;
    }
}
