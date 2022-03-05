package com.minutch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloundConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundConsumerApplication.class, args);
    }

}
