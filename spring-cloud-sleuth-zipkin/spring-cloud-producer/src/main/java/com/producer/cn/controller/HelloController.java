package com.producer.cn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/4 11:43
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "Hello,"+ name + " This is first zipkin";
    }

    @RequestMapping("/getTime")
    public String getTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
