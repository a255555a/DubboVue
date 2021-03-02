package com.young.user;

/**
 * @Author LiuYang
 * @Date 2021/3/2 10:21
 */
public class UserService implements IUserService {
    @Override
    public String hello(String name) {

        System.out.println("springboot superman ......");
        return "superman:" +name;
    }
}
