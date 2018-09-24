package com.fw.user.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class BootApplication {
    public static void main(String[] args){
        SpringApplication.run(BootApplication.class, args);
    }
}
