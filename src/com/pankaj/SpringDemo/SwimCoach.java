package com.pankaj.SpringDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService thefortuneService) {

		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim 1000 mts. as a warmup";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
