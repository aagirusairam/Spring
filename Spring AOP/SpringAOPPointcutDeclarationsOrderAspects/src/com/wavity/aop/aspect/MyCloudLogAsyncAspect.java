package com.wavity.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudLogAsyncAspect {
	//Applying Pointcut declaration to another advice
	@After("com.wavity.aop.aspect.AOPExpressions.forDaoPackageNosettergetter()") 
	public void logToCloudAsyn(){
		System.out.println("Log To Cloud in Asyn fashion");
		}
}
