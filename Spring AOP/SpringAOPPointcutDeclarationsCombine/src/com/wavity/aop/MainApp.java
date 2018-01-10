package com.wavity.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wavity.aop.dao.AccountDAO;
import com.wavity.aop.dao.MembershipDAo;

public class MainApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigDemo.class);
		
		AccountDAO theAccountDAo= context.getBean("accountDAO", AccountDAO.class);

		Account myAccount= new Account();
		theAccountDAo.addAccount(myAccount, true);
		theAccountDAo.doWork();
		
	// these AccountDAO setters & Getters  are not matched
		theAccountDAo.setAccName("saadD");
		theAccountDAo.setAccNum("MMADMASHFH");
		
		String name= theAccountDAo.getAccName(); 
		String number= theAccountDAo.getAccNum();
		// System.out.println(name);
		// System.out.println(number);

		MembershipDAo theMembershipDAO= context.getBean("membershipDAo", MembershipDAo.class);
		theMembershipDAO.addMember();
		theMembershipDAO.Hi();
		
		context.close();
	}
}
