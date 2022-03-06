package com.minutch.service;

import com.minutch.fallback.HelloFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="spring-cloud-provider", fallback = HelloFallBack.class)
public interface HelloService {

    @RequestMapping("/provider/service/hello/feign")
    public String hello();
}
