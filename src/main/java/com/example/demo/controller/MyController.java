package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author biaoyang
 * @Description:
 * @date 2019/1/17 001711:14
 */
@RestController
@CrossOrigin
public class MyController {

    @GetMapping("get")
    public String getMyName(){
        return "jack-====-rose";
    }

    @GetMapping("hello")
    public String hello(){
        return "hi,helloWorld";
    }
}
