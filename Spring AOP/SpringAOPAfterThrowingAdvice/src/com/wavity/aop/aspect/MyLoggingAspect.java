package com.wavity.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	//Adding new @AfterReturning advice on findAccounts()
	@AfterReturning(
			pointcut="execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result){
		String method= theJoinPoint.getSignature().toShortString();
		System.out.println(" Executing @AfterReturning advice on  "+method);
		
		  System.out.println("Result is "+result);
		  
		  // Postprocess the data and modify it
		  
			convertAccountNamesToUpperCase(result);
			  System.out.println("Result is "+result);
		}
	
	//Adding new @After advice on findAccounts()
	@After("execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint){
		String method= theJoinPoint.getSignature().toShortString();
		System.out.println(" Executing @After(Finally) advice on  "+method);
		
		}
		
	//Adding new @AfterThrowing advice on findAccounts()
	@AfterThrowing(
			pointcut="execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))",
			throwing="theExe")
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExe){
		String method= theJoinPoint.getSignature().toShortString();
		System.out.println(" Executing @AfterThrowing advice on  "+method);
		
		  System.out.println("Exception  is "+ theExe);
	}
		  
	private void convertAccountNamesToUpperCase(List<Account> result) {
		for(Account tempAcc: result){
			String theUpperfname = tempAcc.getFirstname().toUpperCase();
			String theUpperlname = tempAcc.getLastname().toUpperCase();
			// update the name on Account
			tempAcc.setFirstname(theUpperfname);
			tempAcc.setLastname(theUpperlname);

		}
	}
	
	//Applying Pointcut declaration to advice
	@Before("com.wavity.aop.aspect.AOPExpressions.forDaoPackageNosettergetter()") 
	public void beforeAddAccountAdive(JoinPoint theJoinPoint){
		System.out.println("Executing @Before Advice on addAccount()");
		
		// Display method signature
		MethodSignature methodSig= (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: "+methodSig);
		

	}	
}
