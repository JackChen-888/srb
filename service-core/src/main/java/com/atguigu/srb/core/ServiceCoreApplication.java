package com.atguigu.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: chen
 * @date: 2021年05月21日 17:35
 */
@SpringBootApplication
@ComponentScan({"com.atguigu.srb"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}