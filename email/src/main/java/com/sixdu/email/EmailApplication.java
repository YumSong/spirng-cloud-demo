package com.sixdu.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class EmailApplication {

    @Value("${server.port}") String port;

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String home(@RequestParam(value = "name", defaultValue = "tony") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
