package com.producer.cn.controller;

import com.producer.cn.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : asus
 * @version : 1.0
 * @Description:
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 * @date :2018/4/26 21:45
 */
@RestController
public class ProducerController {

    @Value("${server.port}")
    String port;

    @RequestMapping({"/hi"})
    public String home(@RequestParam String name) {
        return "Hi " + name + ",I am from port:" + this.port;
    }

    @RequestMapping({"/hello"})
    public String hello(@RequestParam String name) {
        return "Hello " + name + "，This is First Messge";
    }

    @RequestMapping({"/nowTime"})
    public String nowTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    /*
       获取消费端的登录信息
     */
    @RequestMapping("/getLoginInfo")
    public String login(@RequestBody User user){

        String userName = user.getUserName();
        String passWord = user.getPassWord();

        System.out.println("======获取到消费端登录的信息为: "+userName + "==========" + passWord);

        return "1";
    }

    /*
      上传文件
     */
//    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @PostMapping(value = "/uploadFile")
    public String fileUpload(@RequestPart(value = "mfile") MultipartFile file) {

        String fileName = file.getOriginalFilename();     //获取源文件名
        System.out.println("接收到消费端传递的文件名为:" + fileName);

        String filePath = "D:/img/";

        try {

            File mfile = new File(filePath + "/" + fileName);
            if (mfile.exists()) {
                mfile.delete();
            }

            file.transferTo(mfile);   // 转存文件

        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;
    }


}
