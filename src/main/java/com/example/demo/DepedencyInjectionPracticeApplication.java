package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepedencyInjectionPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DepedencyInjectionPracticeApplication.class, args);
		ClientsClass c = context.getBean(ClientsClass.class);
		c.testmethod();
	}

}
