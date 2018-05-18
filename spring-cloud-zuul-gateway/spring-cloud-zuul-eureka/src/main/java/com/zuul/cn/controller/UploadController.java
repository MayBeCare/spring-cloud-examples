package com.zuul.cn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/17 16:10
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@Controller
public class UploadController {

    @Value("${api-file.serviceId}")
    private String servicePath;

    @RequestMapping("/getUploadPage")
    public String upload(Model model){
        model.addAttribute("servicePath",servicePath);
        return "upload";
    }
}
