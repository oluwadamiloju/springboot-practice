package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
	@Autowired
	private FortuneServiceImpl fortuneService;

/*	@Autowired
	public TennisCoach(FortuneServiceImpl fortuneService) {
		this.fortuneService = fortuneService;
	}*/

/*	@Autowired
	public void setFortuneService(FortuneServiceImpl fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	//init method
	@PostConstruct
	public void startUp() {
		System.out.println("Upon startup");
	}

	//destroy method
	@PreDestroy
	public void cleanUp() {
		System.out.println("Upon destruction...");
	}
}
