package com.ayushi.search;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RetailSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailSearchApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();

	}


}
