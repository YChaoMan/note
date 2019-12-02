package com.ycm.eureka.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {

    @Resource
    private RestTemplate restTemplate;
    
    /**
     * 通过RestTemplate来进行消费
     * 
     * @param name
     * @return
     */
    public String print(String name) {
        return restTemplate.getForObject("http://service-one/home?name=" + name, String.class);
    }
}
