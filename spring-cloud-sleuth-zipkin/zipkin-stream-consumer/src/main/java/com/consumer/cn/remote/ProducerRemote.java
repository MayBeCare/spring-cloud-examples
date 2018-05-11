package com.consumer.cn.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/9 15:05
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@FeignClient(name="zipkin-stream-producer")
public interface ProducerRemote {

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name")String name);

    @RequestMapping({"/nowTime"})
    public String nowTime();
}
