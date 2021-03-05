package com.young.v10center;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author LY
 */
@SpringBootApplication
@EnableDubbo
@Import(FdfsClientConfig.class)
public class V10CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(V10CenterApplication.class, args);
    }

}
