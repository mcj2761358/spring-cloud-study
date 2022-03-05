package com.minutch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication8001.class, args);
    }

}
