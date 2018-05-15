package com.feign.cn.remote;

import com.feign.cn.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/26 21:51
 */
@Component    //自定义的熔断类还需要加上@Component注解方式注入容器，否则当熔断执行时会出现找不到类的异常
public class ProducerRemoteHystrix implements ProducerRemote {

    @Override
    public String hello(String name) {
        return "Hello" + name + ", This messge send failed ";
    }

    @Override
    public String nowTime() {
        return "Get Time Failed";
    }

    @Override
    public String login(User user) {
        return "Login Failed";
    }
}
