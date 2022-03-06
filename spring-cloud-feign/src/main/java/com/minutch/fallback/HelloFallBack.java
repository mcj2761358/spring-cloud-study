package com.minutch.fallback;

import com.minutch.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloFallBack implements HelloService {
    @Override
    public String hello() {
        return "hello fall back";
    }
}
