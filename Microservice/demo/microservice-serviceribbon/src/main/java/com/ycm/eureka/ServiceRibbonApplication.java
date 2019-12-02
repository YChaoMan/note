package com.ycm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableDiscoveryClient 向服务中心注册
 *
 * @author cman
 * Dec 2, 2019-11:02:13 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	/**
	 * @bean: 向IoC容器注入一个bean
	 * @LoadBalanced: 说明开启负载均衡功能
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
