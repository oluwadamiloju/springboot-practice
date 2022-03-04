package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve beans from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        Coach subCoach =  context.getBean("trackCoach", Coach.class);

        //check if they are same beans
        boolean result = trackCoach == subCoach;
        System.out.println("Pointing to the same object is " + result);
        System.out.println();
        System.out.println("Memory location for trackCoach: " + trackCoach);
        System.out.println();
        System.out.println("Memory location for subCoach: " + subCoach);

        //close context
        context.close();
    }
}
