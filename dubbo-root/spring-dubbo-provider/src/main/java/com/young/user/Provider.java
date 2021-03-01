package com.young.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author LiuYang
 * @Date 2021/3/1 15:19
 */
public class Provider {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provide.xml"});
        context.start();;

        System.in.read();//按任意键退出
    }
}
