package com.ycm.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ycm.eureka.hystrix.HomeHystrix;

/**
 * 指定访问的服务名，指定fallback类
 */
@FeignClient(value = "service-one", fallback = HomeHystrix.class)
public interface HomeService {

    /**
     * 使用Get方式访问service-one服务名下的/home接口
     */
    @GetMapping(value = "/home")
    String toHome(@RequestParam("name") String name);
}
