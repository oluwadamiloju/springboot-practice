package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RndFortuneBeanScopeDemoApp {
    public static void main(String[] args) {
        //load Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("randomFortune-applicationContext.xml");

        //retrieve beans from container
        Coach footballCoach = context.getBean("footballCoach", Coach.class);

        //call methods on beans
        Coach subCoach =  context.getBean("footballCoach", Coach.class);

        //check if they are same beans
        boolean refResult = footballCoach == subCoach;
        System.out.println("Pointing to the same object is " + refResult);
        System.out.println();
        System.out.println("Memory location for footballCoach: " + footballCoach);
        System.out.println();
        System.out.println("Memory location for subCoach: " + subCoach);

        //close context
        context.close();
    }
}
