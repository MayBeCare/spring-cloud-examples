package com.consumer.cn.controller;

import com.consumer.cn.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/9 15:04
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@RestController
public class FeignController {

    @Autowired
    private ProducerRemote producerRemote;

    @RequestMapping("/sayHello/{name}")
    public String say(@PathVariable("name") String name){
        return producerRemote.sayHello(name);
    }

    @RequestMapping("/getTime")
    public String getTime(){
        return producerRemote.nowTime();
    }
}
