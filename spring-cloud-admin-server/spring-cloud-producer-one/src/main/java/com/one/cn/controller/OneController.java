package com.one.cn.controller;

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
 * @Date : 2018/5/8 10:21
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@RestController
public class OneController {
    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/oneHello/{name}")
    public String index(@PathVariable("name") String name) {
        logger.info("request one  name is "+name);
        return "Hello "+name+"，This is one messge";
    }
}
