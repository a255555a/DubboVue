package com.young.v10center.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.young.api.IProductService;
import com.young.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author LiuYang
 * @Date 2021/3/3 9:16
 */

@RequestMapping("product")
@Controller
public class ProductControllrer {

    //启动检查机制
    @Reference(check = false)
    private IProductService productService;

    @RequestMapping("get/{id}")
    @ResponseBody
    public Product getById(@PathVariable("id") Long id){

        return productService.selectByPrimaryKey(id);
    }


}
