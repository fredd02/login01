package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Login01Application extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(Login01Application.class);
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(Login01Application.class, args);
	}
}
