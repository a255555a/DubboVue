package com.young.v10center.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.young.api.IProductService;
import com.young.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping("list")
    public String list(Model model){

        //1.获取数据
        List<Product> list = productService.list();
       model.addAttribute("list",list);
       //pageinfo分页插件

        return "product/list";
    }

    @RequestMapping("page/{pageIndex}/{pageSize}")
    public String page(Model model,@PathVariable("pageIndex") Integer pageIndex,@PathVariable("pageSize") Integer pageSize){

        /**
         * 获取数据
         *
         */

        PageInfo<Product> pageInfo = productService.page(pageIndex, pageSize);
        model.addAttribute("page",pageInfo);
        return "product/list";
    }


}
