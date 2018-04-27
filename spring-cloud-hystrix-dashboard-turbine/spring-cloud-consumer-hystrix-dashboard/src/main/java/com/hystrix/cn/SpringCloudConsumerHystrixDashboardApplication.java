package com.hystrix.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient      //启用服务注册与发现
@EnableFeignClients         //启用feign进行远程调用
@EnableHystrixDashboard     //启用Hystrix Dashboard(Hystrix 仪表盘)
@EnableCircuitBreaker       //启动断路器,一定不能少,ribbon方式的调用则不需要
public class SpringCloudConsumerHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerHystrixDashboardApplication.class, args);
	}
}
