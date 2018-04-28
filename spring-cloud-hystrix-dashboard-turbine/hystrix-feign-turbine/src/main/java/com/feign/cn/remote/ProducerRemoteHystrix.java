package com.feign.cn.remote;

import org.springframework.stereotype.Component;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/28 10:41
 */
@Component
public class ProducerRemoteHystrix implements ProducerRemote {
    @Override
    public String hello(String name) {
        return "sayHello error";
    }

    @Override
    public String getTime() {
        return "getTime error";
    }
}
