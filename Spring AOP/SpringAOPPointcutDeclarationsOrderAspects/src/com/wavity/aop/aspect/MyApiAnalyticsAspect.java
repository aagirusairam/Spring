package com.wavity.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyApiAnalyticsAspect {
	
	//Applying Pointcut declaration to another advice
		@Before("com.wavity.aop.aspect.AOPExpressions.forDaoPackageNosettergetter()") 
		public void performApiAnalytics(){
			System.out.println(" Performing API Analytics ");
		}

}
