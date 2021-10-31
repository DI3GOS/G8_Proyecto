package com.grupo8.gras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GrasApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder 
	configure(SpringApplicationBuilder 
	application){
	 return 
	application.sources(GrasApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GrasApplication.class, args);
	}

}
