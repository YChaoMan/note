package com.ycm.eureka.hystrix;

import org.springframework.stereotype.Component;

import com.ycm.eureka.service.HomeService;

@Component
public class HomeHystrix implements HomeService {

    @Override
    public String toHome(String name) {
        return "sorry " + name + " this service under maintain...";
    }

}
