package com.luv2code.springdemo;

public class HockeyCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit that puck harder";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return "Hockey, Hockey: " + fortuneService.getFortune();}

	
}
