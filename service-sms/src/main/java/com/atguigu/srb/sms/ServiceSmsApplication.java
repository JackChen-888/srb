package com.atguigu.srb.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:
 * @author: chen
 * @date: 2021年05月27日 11:29
 */
@SpringBootApplication
@ComponentScan({"com.atguigu.srb", "com.atguigu.common"})
@EnableFeignClients
public class ServiceSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSmsApplication.class, args);
    }
}
