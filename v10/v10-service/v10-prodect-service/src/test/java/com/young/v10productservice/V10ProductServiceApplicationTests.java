package com.young.v10productservice;

import com.github.pagehelper.PageInfo;
import com.young.api.IProductService;
import com.young.entity.Product;
import com.young.vo.ProductVO;
import net.minidev.json.JSONUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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

    @Test
    public void addProduct(){

        Product product =new Product();
        product.setName("一加手机");
        product.setPrice(new BigDecimal(3999));
        product.setSalePoint("nice!");
        product.setSalePrice(new BigDecimal(1999));
        product.setImages("#");
        product.setTypeId(2);
        product.setTypeName("电子数码");
        ProductVO productVO = new ProductVO();
        productVO.setProduct(product);
        productVO.setProductDesc("流畅性能强系统优秀！");

        System.out.println(productService.add(productVO));
    }

}
