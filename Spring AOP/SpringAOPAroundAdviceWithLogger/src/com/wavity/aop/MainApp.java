package com.wavity.aop;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wavity.aop.service.TrafficFortuneService;

public class MainApp {
	
	private static Logger mylogger =  Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigDemo.class);
		
		
		TrafficFortuneService theFortuneService= context.getBean("trafficFortuneService", TrafficFortuneService.class);
			mylogger.info("Main Program Calling getFortune \n\n");
			String data = theFortuneService.getFortune();
			mylogger.info("My Fortune is:"+data);
			mylogger.info("Finished!");
		context.close();
	}
}
