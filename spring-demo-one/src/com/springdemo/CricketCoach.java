package com.springdemo;

public class CricketCoach implements Coach{
    private FortuneServiceImpl fortuneService;
    //more properties for our literal values
    private String firstName;
    private String email;

    public CricketCoach() {
//        System.out.println("Cricket coach: no-arg constructor");
    }

    public void setFortuneService(FortuneServiceImpl fortuneService) {
//        System.out.println("Cricket coach: inside setter");
        this.fortuneService = fortuneService;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
