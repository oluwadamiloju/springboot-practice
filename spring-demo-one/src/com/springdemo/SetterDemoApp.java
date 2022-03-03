package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from spring container
//        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
        FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);

        //call methods on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
//        System.out.println(coach.getFirstName());
//        System.out.println(coach.getEmail());

        //close context
        context.close();
    }
}
