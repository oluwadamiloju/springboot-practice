package com.springdemo;

public class SkateboardCoach implements Coach{
    private FortuneServiceImpl fortuneService;

    public SkateboardCoach() {}

    public SkateboardCoach(FortuneServiceImpl fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice balance for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
