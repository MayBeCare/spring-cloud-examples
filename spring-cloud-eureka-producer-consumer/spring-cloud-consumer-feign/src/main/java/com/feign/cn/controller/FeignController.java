package com.feign.cn.controller;

import com.feign.cn.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/26 21:53
 */
@RestController
public class FeignController {

    @Autowired
    private ProducerRemote producerRemote;

    @RequestMapping({"/hello/{name}"})
    public String index(@PathVariable("name") String name) {
        return producerRemote.hello(name);
    }

    @RequestMapping({"/getTime"})
    public String getTime() {
        return producerRemote.nowTime();
    }

}
