package com.young.v10productservice;

import com.young.api.IProductService;
import com.young.entity.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

}
