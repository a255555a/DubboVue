package com.young.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 将具体实现抽象出来，提取出公共方法
 * 抽象类：提供基本的实现
 * @Author LiuYang
 * @Date 2021/3/3 10:02
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    private IBaseDao baseDao;

    public abstract IBaseDao<T> getbaseDao();

    public int countByExample(T t) {
        return getbaseDao().countByExample(t);
    }

    public int deleteByExample(T t) {
        return getbaseDao().deleteByExample(t);
    }

    public int deleteByPrimaryKey(Long id) {
        return getbaseDao().deleteByPrimaryKey(id);
    }

    public int insert(T t) {
        return getbaseDao().insert(t);
    }

    public int insertSelective(T t) {
        return getbaseDao().insertSelective(t);
    }

    public List<T> selectByExample(T t) {
        return getbaseDao().selectByExample(t);
    }

    public T selectByPrimaryKey(Long id) {
        return (T) getbaseDao().selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(T t) {
        return getbaseDao().updateByPrimaryKeySelective(t);
    }

    public int updateByPrimaryKey(T t) {
        return getbaseDao().updateByPrimaryKey(t);
    }

    public List<T> list() {
        return getbaseDao().list();
    }

    public PageInfo<T> page(Integer pageIndex, Integer pageSize) {
        /**
         * 1、设置分页信息
         * 2、获取集合信息 limit
         * 3、返回分页对象
         */
        PageHelper.startPage(pageIndex, pageSize);
        List<T> list = this.list();
        PageInfo<T> pageInfo = new PageInfo<T>(list, 3);
        return pageInfo;
    }


}
