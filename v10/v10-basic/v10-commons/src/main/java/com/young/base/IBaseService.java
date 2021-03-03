package com.young.base;


import java.util.List;

/**
 * @Author LiuYang
 * @Date 2021/3/3 9:58
 */
public interface IBaseService<T> {

    int countByExample(T t);

    int deleteByExample(T t);

    int deleteByPrimaryKey(Long id);

    int insert(T t);

    int insertSelective(T t);

    List<T> selectByExample(T t);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

}
