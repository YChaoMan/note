package com.ycm.eureka.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ycm.eureka.service.HomeService;

@RestController
public class HomeController {

    @Resource
    private HomeService homeService;
    
    @RequestMapping("/home")
    public String print(@RequestParam("name") String name) {
        return homeService.print(name);
    }
}
