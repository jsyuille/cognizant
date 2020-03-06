package com.revature.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
public class ProjectRepsitoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectRepsitoryApplication.class, args);
	}

}
