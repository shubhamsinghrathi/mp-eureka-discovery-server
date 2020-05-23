package com.indi.micropro.mpeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MpEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpEurekaApplication.class, args);
	}

}
