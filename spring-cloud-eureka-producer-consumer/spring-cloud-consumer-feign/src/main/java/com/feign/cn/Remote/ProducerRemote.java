package com.feign.cn.remote;

import com.feign.cn.entity.User;
import feign.Logger;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.feign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



/*
  *  name:远程服务名，即服务提供者spring.application.name配置的名称
  *  此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
  */
 /*
    fallback属性并指定其熔断类就行了
  */
@FeignClient(name="spring-cloud-producer", fallback=ProducerRemoteHystrix.class, configuration = ProducerRemote.MultipartSupportConfig.class)
public interface ProducerRemote {

    @RequestMapping({"/hello"})
    public String hello(@RequestParam("name") String name);

    @RequestMapping({"/nowTime"})
    public String nowTime();

     @RequestMapping("/getLoginInfo")
     public String login(@RequestBody User user);

    @PostMapping(value = "/uploadFile",
//                    produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
                    consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpload(@RequestPart(value = "file") MultipartFile file);

    /*
       用于上传文件
     */
    @Configuration
    class MultipartSupportConfig {
        @Autowired
        private ObjectFactory<HttpMessageConverters> messageConverters;

        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder(new SpringEncoder(messageConverters));
        }

        //指定feign的日志级别
        @Bean
        Logger.Level feignLoggerLevel(){
            return Logger.Level.FULL;
        }
    }
}
