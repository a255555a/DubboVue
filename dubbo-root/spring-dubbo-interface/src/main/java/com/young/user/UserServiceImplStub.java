package com.young.user;

/**
 * @Author LiuYang
 * @Date 2021/3/2 14:30
 */
public class UserServiceImplStub implements IUserService {

    private final IUserService userService;


    public UserServiceImplStub (IUserService userService) {
        this.userService = userService;
    }


    @Override
    public String hello(String name) {
        if (name ==null || "".equals(name.trim())) {

            return "400,validate param";
        }
        return userService.hello(name);
    }
}
