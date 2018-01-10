package com.wavity.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	// @Before("execution(public void com.wavity.aop.dao.AccountDAO.addAccount())") //Advice added to AccountDAO with addAccount method only
	// @Before("execution(public void add*())") //Advice added to any class with any method name starting with add
	// @Before("execution(public * add*())") // Advice added to  any class with any method name starting with add & with any return type.
	// @Before("execution(void add*())") // Advice added to  any class with any method name starting with add & with any return type void only.
	// @Before("execution(public * add*(com.wavity.aop.Account))") // Advice added to  any class with any method name starting with add & with any return type, with modifier public and method param of Account typeonly.
	// @Before("s(public * add*(com.wavity.aop.Account, ..))") // Advice added to  any class with any method name starting with add & with any return type, with modifier public and method param of Account type followed by any number of params.
	// @Before("execution(public * add*(..))") // Advice added to  any class with any method name starting with add & with any return type, with modifier public and method param with any number of params.
	
	@Before("execution(* com.wavity.aop.dao.*.*(..))") // Advice added to the given package com.wavity.aop.dao for any class within package for any method name with any number of arguments and with any return type. 
	public void beforeAddAccountAdvice(){
		System.out.println("Executing @Before Advice on addAccount()");
	}
}
