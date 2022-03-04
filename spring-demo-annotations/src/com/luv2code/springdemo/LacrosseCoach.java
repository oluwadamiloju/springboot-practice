package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class LacrosseCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 100 reps of squats and lunges";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
