package com.malek.simpleServiceReactMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SimpleServiceReactMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceReactMongoApplication.class, args);
	}
}
