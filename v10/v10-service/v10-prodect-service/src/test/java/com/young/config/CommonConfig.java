package com.young.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Author LiuYang
 * @Date 2021/3/3 16:06
 */
@Configuration
public class CommonConfig {

    public PageHelper getPageHelper(){

        PageHelper pageHelper = new PageHelper();

        Properties properties = new Properties();
        properties.setProperty("dialect","mysql");
        properties.setProperty("reasonable","true");
        pageHelper.setProperties(properties);

        return pageHelper;
    }
}
