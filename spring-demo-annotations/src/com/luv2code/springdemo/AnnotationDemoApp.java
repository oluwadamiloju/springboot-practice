package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		Coach lacrosseCoach = context.getBean("lacrosseCoach", Coach.class);

		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println();
		System.out.println(lacrosseCoach.getDailyWorkout());
				
		// close the context
		context.close();
		
	}

}


