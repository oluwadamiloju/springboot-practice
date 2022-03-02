package com.springdemo;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new BaseballCoach();
        System.out.println(coach.getDailyWorkout());

        coach = new SkateboardCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
