package com.young.user.imp;

import com.young.user.IUserService;

/**
 * @Author LiuYang
 * @Date 2021/3/1 14:58
 * 把这个实现作为一个服务发布出来，给其他工程调用
 */
public class UserServiceImpl implements IUserService {

    @Override
    public String hello(String name) {
        System.out.println(name);
        return "hello:" + name;
    }
}
