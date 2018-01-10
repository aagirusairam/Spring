package com.wavity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
							new ClassPathXmlApplicationContext("applicationContext.xml");
		TriangleService thetriangle= context.getBean("triangle", TriangleService.class);
		thetriangle.draw();
		context.close();
	}

}


