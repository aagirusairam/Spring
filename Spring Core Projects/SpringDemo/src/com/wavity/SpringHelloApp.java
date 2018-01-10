package com.wavity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class SpringHelloApp {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  
		/*	ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		 ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml"); */
		Coach theCoach= factory.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
	}
}
