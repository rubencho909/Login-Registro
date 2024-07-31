package com.sena.RegistroLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RegistroLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroLoginApplication.class, args);
	}

}
