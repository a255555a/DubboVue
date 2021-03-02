package com.young.v10productservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LY
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.young.mapper")
public class V10ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(V10ProductServiceApplication.class, args);
    }

}
