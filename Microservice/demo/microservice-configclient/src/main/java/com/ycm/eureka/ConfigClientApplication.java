package com.ycm.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

    @Value("${democonfigclient.message}")
     String foo;
	@GetMapping("/sayFoo")
	public String sayFoo() {
	    return foo;
	}

}
