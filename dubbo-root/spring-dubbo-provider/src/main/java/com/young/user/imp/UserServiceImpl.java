package com.young.user.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.user.IUserService;

/**
 * @Author LiuYang
 * @Date 2021/3/1 14:58
 * 把这个实现作为一个服务发布出来，给其他工程调用
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String hello(String name) {
        System.out.println(name);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello:" + name;
    }
}
