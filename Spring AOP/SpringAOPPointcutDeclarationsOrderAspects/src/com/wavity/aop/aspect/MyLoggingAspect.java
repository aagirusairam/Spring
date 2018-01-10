package com.wavity.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyLoggingAspect {
	
	//Applying Pointcut declaration to advice
	@Before("com.wavity.aop.aspect.AOPExpressions.forDaoPackageNosettergetter()") 
	public void beforeAddAccountAdvice(){
		System.out.println("Executing @Before Advice on addAccount()");
	}
}
