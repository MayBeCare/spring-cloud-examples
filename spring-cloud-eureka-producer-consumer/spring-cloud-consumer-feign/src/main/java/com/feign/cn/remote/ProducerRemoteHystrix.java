package com.feign.cn.remote;

import org.springframework.stereotype.Component;

/**
 * @Description: 继承与HelloRemote实现回调的方法,方法返回值为熔断时返回的结果
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/26 16:27
 * @version : 1.0
 */
@Component
public class ProducerRemoteHystrix implements ProducerRemote {

    @Override
    public String hello(String name) {
        return "Hello" +name+", This messge send failed ";
    }

    @Override
    public String nowTime() {
        return "Get Time Failed";
    }
}
