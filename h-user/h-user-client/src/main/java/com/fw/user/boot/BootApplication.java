package com.fw.user.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.fw.user")
public class BootApplication {
    public static void main(String[] args){
        SpringApplication.run(BootApplication.class, args);
    }
}
