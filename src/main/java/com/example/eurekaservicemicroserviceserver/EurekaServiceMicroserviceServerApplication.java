package com.example.eurekaservicemicroserviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceMicroserviceServerApplication.class, args);
	}

}
