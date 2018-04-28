package com.feign.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients   //启用feign进行远程调用   feign默认集成了ribbon，所以feign也默认实现了负载均衡
@EnableHystrixDashboard     //启用Hystrix Dashboard(Hystrix 仪表盘)
@EnableCircuitBreaker       //启动断路器,一定不能少,ribbon方式的调用则不需要
public class HystrixFeignTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixFeignTurbineApplication.class, args);
	}
}
