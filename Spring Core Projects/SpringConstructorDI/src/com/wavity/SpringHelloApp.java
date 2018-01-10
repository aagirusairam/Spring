package com.wavity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		// Create a bean container
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		/* ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml"); */
		
		// retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();		
	}
}
