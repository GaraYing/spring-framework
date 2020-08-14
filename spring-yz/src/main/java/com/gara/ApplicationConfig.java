package com.gara;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

//	@Bean
//	public AppConfig appConfig(){
//		return new AppConfig();
//	}


	public ApplicationConfig() {
		System.out.println("ApplicationConfig");
	}
}
