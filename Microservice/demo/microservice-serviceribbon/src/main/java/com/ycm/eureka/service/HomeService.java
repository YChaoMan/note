package com.ycm.eureka.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HomeService {

    @Resource
    private RestTemplate restTemplate;
    
    /**
     * 通过RestTemplate来进行消费
     * 
     * @HystrixCommand 对该方法创建了断路器功能，断路方法指定了fallBackHint()，注意参数要一致
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallBackHint")
    public String print(String name) {
        return restTemplate.getForObject("http://service-one/home?name=" + name, String.class);
    }
    
    public String fallBackHint(String name) {
        return "hi " + name + " this service under maintain...";
    }
}
