package com.pioneer.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.pioneer.controller","com.pioneer.config","com.pioneer.model","com.pioneer.dto","com.pioneer.service"})
@EnableJpaRepositories(basePackages = {"com.pioneer.dao"})
public class AppMain {
	public static void main(String[] args) {
	 SpringApplication.run(AppMain.class, args);
		
		System.out.println("welcome to Spring Boot");

	}
}
