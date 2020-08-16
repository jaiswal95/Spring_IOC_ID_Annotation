package com.pankaj.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// You can change the scope by using @scope("---")
@Component
@Scope("singleton")
public class VolleyBallCoach implements Coach {

	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// Field Injection

	public VolleyBallCoach() {
		System.err.println("VolleyBallCoach: inside default Constructor");
	}

	// Create init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.err.println("VolleyBallCoach: inside my doMyStartupStuff");
	}

	// Create destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.err.println("VolleyBallCoach: inside my doMyCleanupStuff");
	}

	@Override
	public String getDailyWorkout() {

		return "\nLearn team Work while playing.";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	

}
