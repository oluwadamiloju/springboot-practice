package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LacrosseCoach implements Coach{
    @Autowired
    @Qualifier("randomFileFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Do 100 reps of squats and lunges";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
