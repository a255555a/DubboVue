package com.young.v10productservice;

import com.github.pagehelper.PageInfo;
import com.young.api.IProductService;
import com.young.entity.Product;
import net.minidev.json.JSONUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class V10ProductServiceApplicationTests {

    @Autowired
    private IProductService productService;

    @Test
    void contextLoads() {
        Product product = productService.selectByPrimaryKey(1L);
        System.out.println(product.getName());
    }

    @Test
    public void list(){

        List<Product> list = productService.list();

        for (Product product : list) {

            System.out.println(list);
            System.out.println(list.size());
        }
        Assert.assertNotNull(list);
    }

    @Test
    public void page(){

        PageInfo<Product> pageInfo = productService.page(1,1);
        System.out.println(pageInfo.getList().size());
        Assert.assertEquals(pageInfo.getList(),2);
    }

}
