package com.young.v10center;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LY
 */
@SpringBootApplication
@EnableDubbo
public class V10CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(V10CenterApplication.class, args);
    }

}
