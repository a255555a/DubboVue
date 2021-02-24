package com.web.springbootweb.config;

import com.web.springbootweb.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author LiuYang
 * @Date 2021/2/23 15:17
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //添加拦截器的配置
        //new MyInterceptor()不属于spring管理，需要bean，不能被注入
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");

    }
}
