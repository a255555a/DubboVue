package com.web.springbootweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author LiuYang
 * @Date 2021/2/23 11:47
 */
@Component
@ConfigurationProperties(prefix = "resource")
public class Resource {

    private String imageServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }
}
