package com.hystrix.cn.controller;

import com.hystrix.cn.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/27 14:35
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProducerRemote producerRemote;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return producerRemote.hello(name);
    }

    @RequestMapping("/queryNowTime")
    public String nowTime(){
        return producerRemote.getTime();
    }
}
