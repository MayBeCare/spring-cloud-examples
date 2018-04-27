package com.hystrix.cn.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/27 14:31
 */
@FeignClient(name = "spring-cloud-producer" , fallback=ProducerRemoteHystrix.class)
public interface ProducerRemote {

    @RequestMapping({"/hello/{name}"})
    public String hello(@PathVariable("name") String name);

    @RequestMapping("/getNowTime")
    public String getTime();
}