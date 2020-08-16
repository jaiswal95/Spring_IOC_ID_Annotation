package com.pankaj.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Spring will automatically registered  this bean

public class TennisCoach implements Coach {

	// Constructor Injection
	public TennisCoach() {
		// System.out.println("Default constructor");
	}

	private FortuneService fortuneService;

	// While using @Qualifier with Constructor,u have to do it like that
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand Tennis";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
