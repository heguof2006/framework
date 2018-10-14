package com.fm.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
public class ApiBootApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiBootApplication.class, args);
    }
}