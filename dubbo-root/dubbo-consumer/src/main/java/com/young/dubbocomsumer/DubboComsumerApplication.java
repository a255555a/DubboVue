package com.young.dubbocomsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LY
 */
@SpringBootApplication
@EnableDubbo
public class DubboComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboComsumerApplication.class, args);
    }

}
