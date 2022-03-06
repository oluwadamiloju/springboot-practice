package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "You'll lose some, you'll win some";
    }
}
