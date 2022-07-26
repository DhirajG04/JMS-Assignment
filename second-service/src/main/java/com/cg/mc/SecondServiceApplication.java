package com.cg.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient    //client for eureka-server
@SpringBootApplication
public class SecondServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondServiceApplication.class, args);
	}

}
