package com.wavity.aop.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.wavity.aop.Account;

@Component
@Aspect
@Order(3)
public class MyLoggingAspect {

	private Logger mylogger = Logger.getLogger(getClass().getName());

	// Adding new @Around advice on findAccounts()
	@Around("execution(* com.wavity.aop.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		String method = theProceedingJoinPoint.getSignature().toShortString();
		mylogger.info(" Executing @Around advice on  " + method);

		long begin = System.currentTimeMillis();

		// We are handling the exception in advice
		Object result = null;
		try {
			result = theProceedingJoinPoint.proceed();
		} catch (Exception e) {
			mylogger.warning(e.getMessage());
			result = "Major Accident! But no worries, " + "Your private helicopter is on way!";

			// throw e; //rethrowing exception
		}

		long end = System.currentTimeMillis();

		long duration = end - begin;

		// myLogger.info can log only strings
		mylogger.info("Duration: " + duration / 1000.0 + " seconds"); // to convert from  milliseconds  to seconds
																	 // 1000  millisecs=  1 second
		return result;

	}

	// Adding new @AfterReturning advice on findAccounts()
	@AfterReturning(pointcut = "execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
		String method = theJoinPoint.getSignature().toShortString();
		mylogger.info(" Executing @AfterReturning advice on  " + method);

		mylogger.info("Result is " + result);

		// Postprocess the data and modify it

		convertAccountNamesToUpperCase(result);
		mylogger.info("Result is " + result);
	}

	// Adding new @After advice on findAccounts()
	@After("execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		mylogger.info(" Executing @After(Finally) advice on  " + method);

	}

	// Adding new @AfterThrowing advice on findAccounts()
	@AfterThrowing(pointcut = "execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))", throwing = "theExe")
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExe) {
		String method = theJoinPoint.getSignature().toShortString();
		mylogger.info(" Executing @AfterThrowing advice on  " + method);

		mylogger.info("Exception  is " + theExe);
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		for (Account tempAcc : result) {
			String theUpperfname = tempAcc.getFirstname().toUpperCase();
			String theUpperlname = tempAcc.getLastname().toUpperCase();
			// update the name on Account
			tempAcc.setFirstname(theUpperfname);
			tempAcc.setLastname(theUpperlname);
		}
	}

	// Applying Pointcut declaration to advice
	@Before("com.wavity.aop.aspect.AOPExpressions.forDaoPackageNosettergetter()")
	public void beforeAddAccountAdive(JoinPoint theJoinPoint) {
		mylogger.info("Executing @Before Advice on addAccount()");

		// Display method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		mylogger.info("Method: " + methodSig);

	}
}
