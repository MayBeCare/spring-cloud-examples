package com.producer.cn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/9 14:55
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@RestController
public class ProducerController {

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name")String name){
        return "Hello "+ name + ", Good Luck!";
    }

    @RequestMapping({"/nowTime"})
    public String nowTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

}
