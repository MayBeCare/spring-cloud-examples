package com.zuul.cn;

import com.zuul.cn.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy      //开启Zuul的API网关服务
public class SpringCloudZuulEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulEurekaApplication.class, args);
	}

	/*
	  注入自定义的过滤器
	 */
	@Bean
	MyFilter myFilter(){
		return new MyFilter();
	}
}
