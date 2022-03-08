package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadmintonJavaConfigDemo {

	public static void main(String[] args) {
		// read spring java config class
		 AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(BadmintonLoversConfig.class);
		
		// get the bean from spring container
		Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);

		// call a method on the bean
		System.out.println(badmintonCoach.getDailyWorkout());
		System.out.println(badmintonCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}

}


