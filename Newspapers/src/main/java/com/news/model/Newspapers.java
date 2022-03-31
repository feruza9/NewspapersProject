package com.news.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Newspapers {

	@Bean
	public String returnNews() {
		return "Financial Times";
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
