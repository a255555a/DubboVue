package com.young.mapper;



import com.young.entity.ProductDesc;
import com.young.entity.ProductDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LY
 */
public interface ProductDescMapper {
    int countByExample(ProductDescExample example);

    int deleteByExample(ProductDescExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductDesc record);

    int insertSelective(ProductDesc record);

    List<ProductDesc> selectByExampleWithBLOBs(ProductDescExample example);

    List<ProductDesc> selectByExample(ProductDescExample example);

    ProductDesc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByPrimaryKeySelective(ProductDesc record);

    int updateByPrimaryKeyWithBLOBs(ProductDesc record);

    int updateByPrimaryKey(ProductDesc record);
}