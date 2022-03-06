package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotionBeancopeDemoApp {
    public static void main(String[] args) {
        //load spring confug file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach subCoach = context.getBean("tennisCoach", Coach.class);

        //check to see if they point to same object
        boolean result = tennisCoach == subCoach;

        //call methods on bean
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for tennis coach: " + tennisCoach);
        System.out.println("Memory location for sub coach: " + subCoach);

        //close context
        context.close();
    }
}
