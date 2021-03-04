package com.young.api;

import com.github.pagehelper.PageInfo;
import com.young.base.IBaseService;
import com.young.entity.Product;
import com.young.vo.ProductVO;

import java.util.List;

/**
 * 继承基类，里面包含公共的方法
 * @Author LiuYang
 * @Date 2021/3/2 16:18
 */
public interface IProductService extends IBaseService<Product> {

    /**
     * 分页
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public PageInfo<Product> page(Integer pageIndex,Integer pageSize);

    /**
     * 添加商品
     * @param productVO
     * @return
     * 返回主键
     */
    public Long add(ProductVO productVO);

//    public List<Product> list();
}
