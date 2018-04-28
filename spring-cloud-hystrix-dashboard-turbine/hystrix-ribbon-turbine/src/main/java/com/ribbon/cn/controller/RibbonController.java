package com.ribbon.cn.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/28 10:48
 */
@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/sayHello/{name}")
    @HystrixCommand(fallbackMethod = "helloError")
    public String ribbonHello(@PathVariable("name") String name){
        return restTemplate.getForObject("http://spring-cloud-producer/hello/"+name,String.class);
    }

    @RequestMapping("/getTime")
    @HystrixCommand(fallbackMethod = "timeError")
    public String ribbonNowTime(){
        return restTemplate.getForObject("http://spring-cloud-producer/getNowTime",String.class);
    }

    public String helloError(String name){
        return "Error sayHello";
    }

    public String timeError(){
        return "Error getTime";
    }
}











