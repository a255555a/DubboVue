package com.young.dubboprovider.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.user.IUserService;

/**
 * @Author LiuYang
 * @Date 2021/3/1 17:21
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Override
    public String hello(String name) {
        System.out.println("Springboot1.0.0 hello.....");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Springboot1.0.0 hello:" + name;
    }
}
