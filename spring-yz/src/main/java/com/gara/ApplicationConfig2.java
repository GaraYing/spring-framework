package com.gara;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig2 {

//	@Bean
//	public AppConfig appConfig(){
//		return new AppConfig();
//	}


	public ApplicationConfig2() {
		System.out.println("ApplicationConfig2");
	}
}
