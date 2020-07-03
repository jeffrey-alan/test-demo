package com.example.testdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("hello")
    public Object hello(){
        return "Hello, World!";
    }

}
