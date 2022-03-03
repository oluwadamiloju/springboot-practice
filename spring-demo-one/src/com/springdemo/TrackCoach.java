package com.springdemo;

public class TrackCoach implements Coach{
    private FortuneServiceImpl fortuneService;

    public TrackCoach(FortuneServiceImpl fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "You'll be first at track today and " + fortuneService.getFortune();
    }

    //add init method
    private void startup() {
        System.out.println("Starting the application...");
    }

    //destroy method
    private void cleanup() {
        System.out.println("Shutting down...");
    }
}
