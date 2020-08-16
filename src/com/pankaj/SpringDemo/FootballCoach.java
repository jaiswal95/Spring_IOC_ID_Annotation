package com.pankaj.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class FootballCoach implements Coach {

	// Setter and method Injection

	private FortuneService fortuneService;

	// Define the no-args Constructor
	public FootballCoach() {
		// System.out.println("FootballCoach : inside default constructor");
	}

	// Define a setter method for injection and configure @Autowired Annotation
	/*
	 * @Autowired 
	 * public void setFortuneService(FortuneService thefortuneService) {
	 *      System.out.println("FootballCoach : inside setFortuneService method");
	 *      this.fortuneService = thefortuneService;
	 *       }
	 */

	// Any method Injection(this method using it for Dependency Injection)
	@Autowired
	public void doMyCrazyStuff(FortuneService thefortuneService) {
		// System.out.println("FootballCoach : inside doMyCrazyStuff method");
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Get a skill to play Football";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
