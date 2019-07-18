package com.sprintboot.init.testlk.testlk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sprintboot.init.testlk.testlk")
@SpringBootApplication
public class SpringBootMysqldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqldbApplication.class, args);
	}
	

}
