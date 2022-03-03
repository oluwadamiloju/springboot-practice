package com.springdemo;

public class BaseballCoach implements Coach{
    private FortuneServiceImpl fortuneService;

    public BaseballCoach(FortuneServiceImpl fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
