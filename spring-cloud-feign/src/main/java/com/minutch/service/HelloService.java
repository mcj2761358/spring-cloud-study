package com.minutch.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-provider")
public interface HelloService {

    @RequestMapping("/provider/service/hello/feign")
    public String hello();
}
