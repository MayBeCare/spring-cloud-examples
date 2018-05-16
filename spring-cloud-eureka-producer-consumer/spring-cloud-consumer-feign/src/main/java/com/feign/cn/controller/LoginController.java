package com.feign.cn.controller;

import com.feign.cn.entity.User;
import com.feign.cn.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/15 10:09
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@Controller
public class LoginController {

    //获取上传的文件夹，具体路径参考application.properties中的配置
    @Value("${file.upload-path}")
    private String uploadPath;

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


    /*
      上传文件页面
     */
    @RequestMapping("/upload")
    public String upload(){
        return "fileUpload";
    }

    @RequestMapping("/getUploadInfo")
    @ResponseBody
    public String getUploadInfo(@RequestParam(value = "mfile", required = false)MultipartFile file, String desc, HttpServletRequest request){

     /*   String fileName = file.getOriginalFilename();     //获取源文件名
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());    //获取源文件后缀名

        System.out.println("文件名为:" + fileName);
        System.out.println("文件描述为:" + desc);

//        String filePath = "D:/img/";

        try {

            File mfile = new File(uploadPath + "/" + fileName);
            if (mfile.exists()) {
                mfile.delete();
            }

            file.transferTo(mfile);   // 转存文件

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        return producerRemote.fileUpload(file);
    }
}
