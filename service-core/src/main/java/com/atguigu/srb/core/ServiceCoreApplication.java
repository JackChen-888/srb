package com.atguigu.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: chen
 * @date: 2021年05月21日 17:35
 */
@EnableSwagger2
@SpringBootApplication
@ComponentScan({"com.atguigu.srb", "com.atguigu.common", "com.atguigu.base"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}