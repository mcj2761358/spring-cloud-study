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
    public String hello() {

        System.out.println(""+request.getRemoteHost()+":"+request.getServerPort());
        return "hello,spring cloud!";
    }
}
