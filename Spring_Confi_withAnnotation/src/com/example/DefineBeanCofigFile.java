package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example")
@PropertySource("classpath:sport.properties")  //give path of file where data is stored
public class DefineBeanCofigFile {
	
	
	//interface name then the function who is implementing  here sadFortuneService is ID
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	//here we are injection the dependencies
	@Bean
	public Coach swimCoach() {
		//we are passing the class
		return new SwimCoach(sadFortuneService());
	}

}
