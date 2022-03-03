package com.springdemo;

public class CricketCoach implements Coach{
    private FortuneServiceImpl fortuneService;

    public CricketCoach() {
//        System.out.println("Cricket coach: no-arg constructor");
    }

    public void setFortuneService(FortuneServiceImpl fortuneService) {
//        System.out.println("Cricket coach: inside setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
