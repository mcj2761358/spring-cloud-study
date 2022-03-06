package com.minutch.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String hello() {

        String result = restTemplate.getForEntity("http://SPRING-CLOUD-PROVIDER/provider/service/hello", String.class).getBody();
        return result;
    }


    @RequestMapping("/web/hystrix")
    @HystrixCommand(fallbackMethod = "error")
    public String hystrix() {

        String result = restTemplate.getForEntity("http://SPRING-CLOUD-PROVIDER/provider/service/hello", String.class).getBody();
        return result;
    }

    public String error() {
        return "error";
    }
}
