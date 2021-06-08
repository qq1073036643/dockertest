package com.example.dockertest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("xx");
        return " hello world";
    }
}
