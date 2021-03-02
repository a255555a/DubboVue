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
    @Reference(loadbalance = "leastactive ",version = "2.0.0")
    private IUserService userService;

    @RequestMapping("hello")
    public String hello(String name){

        return userService.hello(name);
    }
}
