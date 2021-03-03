package com.young.v10productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.api.IProductService;
import com.young.entity.Product;
import com.young.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author LiuYang
 * @Date 2021/3/2 16:23
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
