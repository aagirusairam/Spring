package com.wavity.aop.aspect;

import org.aspectj.lang.JoinPoint;
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

	// Applying Pointcut declaration to advice
	@Before("com.wavity.aop.aspect.AOPExpressions.forDaoPackageNosettergetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("Executing @Before Advice on addAccount()");

		// Display method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();

		System.out.println("Method: " + methodSig);

		// Display method arguments

		Object[] args = theJoinPoint.getArgs();

		for (Object temp : args) {
			System.out.println(temp.toString());

			if (temp instanceof Account) {

				// downcast and print account specific info
				Account theAccount = (Account) temp;
				System.out.println(" " + theAccount.getFirstname());
				System.out.println(" " + theAccount.getLastname());

			}
		}

	}

}
