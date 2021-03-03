package com.young.v10productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageInfo<Product> page(Integer pageIndex, Integer pageSize) {
        /**
         * 1、设置分页信息
         * 2、获取集合信息 limit
         * 3、返回分页对象
         */
        PageHelper.startPage(pageIndex,pageSize);
        List<Product> list = this.list();
        PageInfo<Product> pageInfo = new PageInfo<Product>(list,3);
        return pageInfo;
    }

//    BaseService中加入了改方法，所以删除
//    @Override
//    public List<Product> list() {
//        return productMapper.list();
//    }
}
