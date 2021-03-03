package com.young.mapper;


import com.young.base.IBaseDao;
import com.young.entity.ProductType;
import com.young.entity.ProductTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LY
 */
public interface ProductTypeMapper extends IBaseDao<ProductType> {


    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

}