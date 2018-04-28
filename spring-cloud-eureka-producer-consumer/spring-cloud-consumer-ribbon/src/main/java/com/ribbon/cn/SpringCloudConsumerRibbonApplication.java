package com.ribbon.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix     //开启hystrix(熔断器)功能,这个是必须的,并且需要在程序中声明断路点HystrixCommand;
                   //feign方式的调用则不需要，其自带断容器，只需在配置文件中开启
public class SpringCloudConsumerRibbonApplication {

	@Bean            //注册一个具有容错功能的RestTemplate
	@LoadBalanced    //@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
	RestTemplate restTemplate(){
		return new RestTemplate();     //以RestTemplate的方式调用服务
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerRibbonApplication.class, args);
	}
}
