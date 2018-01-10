package com.wavity.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	
	// Creating Pointcut Declaration
	@Pointcut("execution(* com.wavity.aop.dao.*.*(..))") 
	private void forDaoPackage(){}
	
	//Applying Pointcut declaration to advice
	@Before("forDaoPackage()")  
	public void beforeAddAccountAdive(){
		System.out.println("Executing @Before Advice on addAccount()");
	}
	
	//Applying Pointcut declaration to another advice
	@Before("forDaoPackage()") 
	public void performApiAnalytics(){
		System.out.println("Performing API Analytics");
	}
}
