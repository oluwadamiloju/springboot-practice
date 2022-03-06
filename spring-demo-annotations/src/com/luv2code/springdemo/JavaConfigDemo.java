package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// read spring java config class
		 AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach lacrosseCoach = context.getBean("lacrosseCoach", Coach.class);

		// call a method on the bean
		System.out.println(lacrosseCoach.getDailyWorkout());
		System.out.println(lacrosseCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}

}


