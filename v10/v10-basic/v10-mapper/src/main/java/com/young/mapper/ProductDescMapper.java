package com.young.mapper;



import com.young.base.IBaseDao;
import com.young.entity.ProductDesc;
import com.young.entity.ProductDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LY
 */
public interface ProductDescMapper extends IBaseDao<ProductDesc> {


    List<ProductDesc> selectByExampleWithBLOBs(ProductDescExample example);

    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByPrimaryKeyWithBLOBs(ProductDesc record);

}