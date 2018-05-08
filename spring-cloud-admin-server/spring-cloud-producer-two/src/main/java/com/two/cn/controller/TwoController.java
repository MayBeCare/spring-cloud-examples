package com.two.cn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/8 10:28
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */

@RestController
public class TwoController {

    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/twoHello/{name}")
    public String index(@PathVariable("name") String name) {
        logger.info("Request two name is "+name);
        try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            logger.error(" Hello two error",e);
        }
        return "Hello "+name+"，This is two messge";
    }
}
