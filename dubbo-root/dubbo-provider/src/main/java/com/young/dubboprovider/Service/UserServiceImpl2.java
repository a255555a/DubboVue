package com.young.dubboprovider.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.user.IUserService;

/**
 * @Author LiuYang
 * @Date 2021/3/2 14:14
 */
@Service(version = "2.0.0")
public class UserServiceImpl2 implements IUserService {

    @Override
    public String hello(String name) {
        System.out.println("Springboot2.0.0 hello.....");

        return "Springboot2.0.0 hello:" + name;
    }
}
