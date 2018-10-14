package com.fw.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
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
}
