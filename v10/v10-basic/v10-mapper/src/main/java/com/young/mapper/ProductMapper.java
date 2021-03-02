package com.young.mapper;


import com.young.entity.Product;
import com.young.entity.ProductExample;
import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LY
 */
public interface ProductMapper {

    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}