package com.fw.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        System.out.print("test");
    }
}
