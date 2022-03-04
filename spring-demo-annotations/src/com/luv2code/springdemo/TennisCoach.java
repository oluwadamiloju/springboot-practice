package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneServiceImpl fortuneService;

//	@Autowired
//	public TennisCoach(FortuneServiceImpl fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Autowired
	public void setFortuneService(FortuneServiceImpl fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
