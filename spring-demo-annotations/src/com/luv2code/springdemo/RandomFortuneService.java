package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private String[] fortuneList = {"Credit alert today!",
            "Nothing will cause you anxiety today!",
            "You'll meet someone new today, hold them close!"};

    @Override
    public String getDailyFortune() {
        Random rnd = new Random();
        int index = rnd.nextInt(fortuneList.length);
        return fortuneList[index];
    }
}
