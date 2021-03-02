package com.young.mapper;


import com.young.entity.ProductType;
import com.young.entity.ProductTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LY
 */
public interface ProductTypeMapper {

    int countByExample(ProductTypeExample example);

    int deleteByExample(ProductTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    List<ProductType> selectByExample(ProductTypeExample example);

    ProductType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}