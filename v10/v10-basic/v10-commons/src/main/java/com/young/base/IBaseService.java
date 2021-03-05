package com.young.base;


import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author LiuYang
 * @Date 2021/3/3 9:58
 */
public interface IBaseService<T> {

    /**
     * 查询数量
     * @param t
     * @return
     */
    int countByExample(T t);

    /**
     * 删除某条记录
     * @param t
     * @return
     */
    int deleteByExample(T t);

    /**
     * 通过主键Id删除记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入单条记录，全部参数都是必填
     * @param t
     * @return
     */
    int insert(T t);

    /**
     *插入只需要有Id，其他的参数都是选填
     * @param t
     * @return
     */
    int insertSelective(T t);

    /**
     * 查询条件可选的
     * @param t
     * @return
     */
    List<T> selectByExample(T t);

    /**
     * 根据主键ID查询
     * @param id
     * @return
     */
    T selectByPrimaryKey(Long id);

    /**
     * 根据主键Id，选择参数更新记录
     * @param t
     * @return
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 根据主键Id，全部更新，每个参数都是必选选项
     * @param t
     * @return
     */
    int updateByPrimaryKey(T t);

    /**
     * flag=1，查询记录
     * @return
     */
    List<T> list();

    /**
     * 根据页数查询
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public PageInfo<T> page(Integer pageIndex, Integer pageSize) ;
}
