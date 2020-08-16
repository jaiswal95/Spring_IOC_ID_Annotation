package com.pankaj.SpringDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is Sad Day!";
	}

}
