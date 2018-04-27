package com.producer.cn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/27 14:28
 */
@RestController
public class ProducerController {

    @RequestMapping({"/hello/{name}"})
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name + "，This is Hystrix Test Messge";
    }

    @RequestMapping("/getNowTime")
    public String getTime(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
