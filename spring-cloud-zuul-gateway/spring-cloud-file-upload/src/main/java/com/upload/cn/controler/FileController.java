package com.upload.cn.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/17 16:17
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@Controller
public class FileController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@RequestParam(value = "file", required = false)MultipartFile file,String token) throws IOException {

        String fileName = file.getOriginalFilename();

        long size = file.getSize();

        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        int MB = 1024 * 1024;//定义MB的计算常量

        String format = df.format(size / (float) MB) + "MB";

        System.out.println("=========>>>>文件大小为:" + format);
        System.out.println("=========>>>>上传的文件的token为:"+token);
        System.out.println("=========>>>>上传的文件名为:"+fileName);

        return "Upload SUCCESS";
    }

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){
        return "Hello, " + name;
    }
}
