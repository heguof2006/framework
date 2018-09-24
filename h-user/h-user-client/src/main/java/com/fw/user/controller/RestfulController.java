package com.fw.user.controller;

import com.fw.user.service.RestfulServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestfulController {

    @Autowired 
    private RestfulServiceImpl restfulService ;

    @Value("${server.port}")
    String port ;
    @Value("${spring.application.name}")
    String name ;

    @RequestMapping("/testhello/{name}")
    public String home(@PathVariable String name){
        return name+"================"+restfulService.getRestData(name);
    }
}
