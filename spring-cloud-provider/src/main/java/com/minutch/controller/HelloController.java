package com.minutch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/service/hello")
    public String hello() throws InterruptedException {

        Thread.sleep(4000L);
        System.out.println(""+request.getRemoteHost()+":"+request.getServerPort());
        return "hello,spring cloud!";
    }

    @RequestMapping("/service/hello/feign")
    public String helloFeign() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println(""+request.getRemoteHost()+":"+request.getServerPort());
        return "hello,spring cloud feign!";
    }
}
