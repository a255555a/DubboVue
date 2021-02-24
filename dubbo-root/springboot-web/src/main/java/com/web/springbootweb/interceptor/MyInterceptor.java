package com.web.springbootweb.interceptor;

import com.web.springbootweb.config.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author LiuYang
 * @Date 2021/2/23 15:15
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    @Autowired
    private Resource resource;

    /**
     * 预处理
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("MyInterceptor preHandle.........");
        System.out.println("test!");
        System.out.println("test!");
        System.out.println("test!");
        System.out.println("test!");

        System.out.println(resource.getImageServer());
        return true;
    }
}
