package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "You'll win a great prize today";
    }
}
