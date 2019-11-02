package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableEnvironment environment = new StandardEnvironment();
		environment.setActiveProfiles("dev");
		SpringApplication springApplication = new SpringApplication(Demo1Application.class);
		springApplication.setEnvironment(environment);
		springApplication.run(args);
	}

}
