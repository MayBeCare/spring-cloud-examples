package com.zuul.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulEurekaApplication.class, args);
	}
}
