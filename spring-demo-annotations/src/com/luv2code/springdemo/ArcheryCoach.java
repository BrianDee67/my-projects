package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ArcheryCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your draw length";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
