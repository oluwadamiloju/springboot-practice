package com.springdemo;

import java.util.Random;

public class RandomFortuneImpl implements FortuneService{
    // create an array of strings
    private String[] fortunes = {
            "Eat beans today!",
            "You'll find love really soon!",
            "Some good news that'll change your life's course is coming this month"
    };

    private Random rnd = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = rnd.nextInt(fortunes.length);
        String todaysFortune = fortunes[index];
        return todaysFortune;
    }
}
