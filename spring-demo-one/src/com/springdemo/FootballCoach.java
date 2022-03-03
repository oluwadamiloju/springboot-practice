package com.springdemo;

public class FootballCoach implements Coach{
    private RandomFortuneImpl randomFortune;

    public RandomFortuneImpl getRandomFortune() {
        return randomFortune;
    }

    public void setRandomFortune(RandomFortuneImpl randomFortune) {
        this.randomFortune = randomFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Attend practice this weekend for extra points!";
    }

    @Override
    public String getDailyFortune() {
        return randomFortune.getFortune();
    }
}
