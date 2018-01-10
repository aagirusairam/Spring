package com.wavity.aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wavity.aop.dao.AccountDAO;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo.class);

		AccountDAO theAccountDAo = context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccount = null;
		try {
			boolean tripWire = true;
			theAccount = theAccountDAo.findAccounts(tripWire);
		} catch (Exception exc) {
			System.out.println("Exception is caught in MainAPP " + exc);
		}

		System.out.println("MainApp: AfterThrowing Advice: " + theAccount);
		context.close();
	}
}
