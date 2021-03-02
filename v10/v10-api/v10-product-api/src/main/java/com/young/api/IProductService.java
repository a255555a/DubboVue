package com.young.api;

import com.young.entity.Product;

/**
 * @Author LiuYang
 * @Date 2021/3/2 16:18
 */
public interface IProductService {

    /**
     * 产品
     * @param id
     * @return
     */
    public Product getById(Long id) ;
}
