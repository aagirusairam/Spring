package com.wavity.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	public String getFortune() {

		System.out.println("getFortune() method of TrafficFortuneService is being executed");
		// simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "Expect heavy traffic this Morning";
	}

}
