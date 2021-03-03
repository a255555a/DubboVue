package com.young.mapper;


import com.young.base.IBaseDao;
import com.young.entity.Product;
import com.young.entity.ProductExample;
import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LY
 */
public interface ProductMapper extends IBaseDao<Product> {

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

}