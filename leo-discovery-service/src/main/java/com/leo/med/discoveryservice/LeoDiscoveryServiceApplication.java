package com.leo.med.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LeoDiscoveryServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeoDiscoveryServiceApplication.class, args);
	}
}
