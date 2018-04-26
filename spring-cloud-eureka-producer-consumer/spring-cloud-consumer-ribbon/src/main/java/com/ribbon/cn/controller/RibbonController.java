package com.ribbon.cn.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/ribbon/getTime")
    @HystrixCommand(fallbackMethod = "hystrixError")
    public String getTime(){
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/nowTime" , String.class);
    }

    @RequestMapping("/ribbon/hello/{name}")
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(@PathVariable("name") String name){
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/hello?name="+name , String.class);
    }



    /*
      熔断时返回的值
      使用注解@HystrixCommand(fallbackMethod = “method”)指定回调函数，
      回调函数的返回值和参数必须和正式方法相同，不然会报错
     */
    public String hystrixError(){
        return "sorry, 访问 SPRING-CLOUD-PRODUCER 服务 getTime 出错";
    }


    public String helloError(String name){
        return "Sorry,"+name+" ! No Hello";
    }

}
