package com.qxy.zuul.demoservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceAApplication.class, args);
    }

}
