package com.hystrix.cn.remote;

import org.springframework.stereotype.Component;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/27 14:33
 */

@Component
public class ProducerRemoteHystrix implements ProducerRemote {

    @Override
    public String hello(String name) {

        return "Hello" + name + ", This Hystrix messge send failed ";
    }

    @Override
    public String getTime() {
        return "get now time failed";
    }
}
