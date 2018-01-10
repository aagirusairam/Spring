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
	
	// create pointcuts for setter methods
	@Pointcut("execution(* com.wavity.aop.dao.*.set*(..))") 
	private void setter(){}
	
	// create pointcuts for setter methods
	@Pointcut("execution(* com.wavity.aop.dao.*.get*(..))") 
	private void getter(){}
	
	// Combining Pointcut expressions using logical operators and excluding setters and getters
	@Pointcut("forDaoPackage() && !(getter() || setter())") 
	private void forDaoPackageNoSetterGetter(){}
	
	
	//Applying Pointcut declaration to advice
	@Before("forDaoPackageNoSetterGetter()") 
	public void beforeAddAccountAdive(){
		System.out.println("Executing @Before Advice on addAccount()");
	}
	
	//Applying Pointcut declaration to another advice
	@Before("forDaoPackageNoSetterGetter()") 
	public void performApiAnalytics(){
		System.out.println("Performing API Analytics");
	}
	
}
