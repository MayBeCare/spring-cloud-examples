package com.feign.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //启用服务注册与发现
@EnableFeignClients    //启用feign进行远程调用
public class SpringCloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerFeignApplication.class, args);
	}
}
