package com.ycm.eureka.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ycm.eureka.service.HomeService;

@RestController
public class HomeController {

    @Resource
    private HomeService homeService;
    
    @GetMapping(value = "/home")
    public String toHome(@RequestParam("name") String name) {
        return homeService.toHome(name); 
    }
}
