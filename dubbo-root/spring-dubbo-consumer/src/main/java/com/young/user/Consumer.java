package com.young.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author LiuYang
 * @Date 2021/3/1 16:51
 */
public class Consumer {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();;
        //调用远程服务

        IUserService userService = context.getBean(IUserService.class);
        System.out.println(userService.hello("dubbo"));


        System.in.read();//按任意键退出
    }
}
