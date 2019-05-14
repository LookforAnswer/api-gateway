package com.qxy.zuul.demoeureke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEurekeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekeApplication.class, args);
	}

}
