package com.luv2code.springdemo;

public class RomanceFortune implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "The love of your life is right in front of your eyes.";
    }
}
