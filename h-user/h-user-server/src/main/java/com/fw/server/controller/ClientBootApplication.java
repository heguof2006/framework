package com.fw.server.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //启动EnableEureka客户端
@RestController
public class ClientBootApplication{

	@GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
		Thread t = new Thread();
		Object o = null;
        System.out.println(name+"我的测试client1");
        return name+"我的测试client1";
    }
	
	@GetMapping("/hi/{name}")
    public String hi(@PathVariable String name){
        System.out.println(name+"hi------------------");
        return name+"hi-------provider测试";
    }
	
    public static void main(String[] args) {
        SpringApplication.run(ClientBootApplication.class, args);
    }
    
}
