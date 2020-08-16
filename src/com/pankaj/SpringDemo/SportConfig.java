package com.pankaj.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.pankaj.SpringDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// Define Bean for our SadFortuneService
	@Bean
	public SadFortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// Define Bean for our SwimCoach and Inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
