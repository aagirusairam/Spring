package com.wavity.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wavity.aop.service.TrafficFortuneService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo.class);

		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		System.out.println("Main Program Calling getFortune \n\n");
		String data = theFortuneService.getFortune();
		System.out.println("My Fortune is:" + data);
		System.out.println("Finished!");
		context.close();
	}
}
