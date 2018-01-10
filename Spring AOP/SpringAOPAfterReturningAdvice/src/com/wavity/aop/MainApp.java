package com.wavity.aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wavity.aop.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigDemo.class);
		
		AccountDAO theAccountDAo= context.getBean("accountDAO", AccountDAO.class);
			List<Account> theAccount= theAccountDAo.findAccounts();
		
		System.out.println("MainApp: AfterReturning Advice: "+theAccount);
		context.close();
	}
}
