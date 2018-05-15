package com.feign.cn.controller;

import com.feign.cn.entity.User;
import com.feign.cn.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/15 10:09
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@Controller
public class LoginController {

    @Autowired
    private ProducerRemote producerRemote;

    @RequestMapping("/getLogin")
    public String getLogin(){
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){

        String userName = user.getUserName();
        String passWord = user.getPassWord();

        System.out.println("======获取到页面登录的信息为: "+userName + "==========" + passWord);

        return producerRemote.login(user);
    }
}
