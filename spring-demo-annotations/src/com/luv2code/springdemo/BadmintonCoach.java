package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    private FortuneService fortuneService;

    public BadmintonCoach(FortuneService romanceFortune) {
        this.fortuneService = romanceFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice push defence forehand/backhand";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
