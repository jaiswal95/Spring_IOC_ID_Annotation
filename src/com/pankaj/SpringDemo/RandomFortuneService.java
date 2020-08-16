package com.pankaj.SpringDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "Beware of wolf in Sheep's clothing", "Digilence is the mother of goodluck",
			"The journey is the reward" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// Pick a random string from the array

		// Get random number based on size of an array
		int index = myRandom.nextInt(data.length);

		// Grab the Fortune from the Array
		String theFortune = data[index];

		return theFortune;
	}
}
