package com.producer.cn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/3 10:29
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return "Hello "+name+"，This is First Messge";
    }
}
