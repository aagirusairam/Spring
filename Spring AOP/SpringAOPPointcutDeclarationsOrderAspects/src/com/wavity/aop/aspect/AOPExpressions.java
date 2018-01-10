package com.wavity.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpressions {
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
		public void forDaoPackageNosettergetter(){}
		

}
