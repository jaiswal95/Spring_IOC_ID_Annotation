package com.pankaj.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Daily Workout on a Ground to strong ur legs. ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
