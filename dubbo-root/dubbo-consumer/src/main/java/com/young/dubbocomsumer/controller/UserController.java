package com.young.dubbocomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.young.user.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LiuYang
 * @Date 2021/3/2 10:28
 */
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 细粒度的控制
     */
    @Reference(version = "2.0.0",stub = "com.young.user.UserServiceImplStub",cluster = "failfast")
    private IUserService userService;

    @RequestMapping("hello")
    public String hello(String name){

        /**
         * 调用远程服务
         * 有效的调用
         * 假设name是必传参数
         */
        return userService.hello(name);
    }
}
