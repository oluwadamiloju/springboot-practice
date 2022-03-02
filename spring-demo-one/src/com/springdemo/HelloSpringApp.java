package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        //call methods on bean
        System.out.println(coach.getDailyWorkout());

        //close context
        context.close();
    }
}
