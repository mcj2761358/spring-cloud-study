package com.minutch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProviderApplication8081 {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderApplication8081.class, args);
    }

}
