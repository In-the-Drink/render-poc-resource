package com.github.inthedrink.render.poc.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class RenderPocResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenderPocResourceApplication.class, args);
	}

}
