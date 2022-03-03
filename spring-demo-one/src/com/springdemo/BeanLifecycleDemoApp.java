package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        //retrieve beans from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        //call methods on bean
        System.out.println(trackCoach.getDailyFortune());

        //close context
        context.close();
    }
}
