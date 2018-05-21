package com.client.cn.controller;

import com.client.cn.dao.UserInfoDao;
import com.client.cn.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/30 17:57
 */
@RestController
@RefreshScope        //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ClientController {

    @Value("${neo.hello}")
    private String hello;

    @Autowired
    private UserInfoDao userInfoDao;

    @RequestMapping("/hello")
    public String from() {
        return this.hello ;
    }

    @RequestMapping("/getUserInfo/{userId}")
    public UserInfo getUserInfo(@PathVariable("userId") Integer userId){
        return userInfoDao.findByUserId(userId);
    }
}
