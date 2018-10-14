package com.fw.server;

import com.netflix.appinfo.ApplicationInfoManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
public class ServerBootApplication {

    public static void main(String[] args) {
        AnnotationUtils mm = null;
        SpringApplication.run(ServerBootApplication.class, args);
    }
    
}
