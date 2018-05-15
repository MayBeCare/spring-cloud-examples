package com.feign.cn.remote;

import com.feign.cn.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


 /*
  *  name:远程服务名，即服务提供者spring.application.name配置的名称
  *  此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
  */
 /*
    fallback属性并指定其熔断类就行了
  */
@FeignClient(name="spring-cloud-producer", fallback=ProducerRemoteHystrix.class)
public interface ProducerRemote {

    @RequestMapping({"/hello"})
    public String hello(@RequestParam("name") String name);

    @RequestMapping({"/nowTime"})
    public String nowTime();

     @RequestMapping("/getLoginInfo")
     public String login(@RequestBody User user);
}
