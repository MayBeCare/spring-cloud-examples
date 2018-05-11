package com.producer.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZipkinStreamProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinStreamProducerApplication.class, args);
	}
}
