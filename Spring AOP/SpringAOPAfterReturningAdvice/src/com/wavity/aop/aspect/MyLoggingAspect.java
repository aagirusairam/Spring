package com.wavity.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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

	// Adding new @AfterReturning advice on findAccounts()
	@AfterReturning(pointcut = "execution(* com.wavity.aop.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {

		String method = theJoinPoint.getSignature().toShortString();
		System.out.println(" Executing @AfterReturning advice on  " + method);

		System.out.println("Result is " + result);

		// Postprocess the data and modify it and send to target object

		convertAccountNamesToUpperCase(result);
		System.out.println("Result is " + result);
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

		System.out.println("Executing @Before Advice on addAccount()");

		// Display method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: " + methodSig);

	}
}
