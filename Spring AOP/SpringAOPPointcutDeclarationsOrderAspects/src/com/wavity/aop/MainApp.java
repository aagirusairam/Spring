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
		theAccountDAo.setAccName("saadD");
		theAccountDAo.setAccNum("MMADMASHFH");
		
		String name= theAccountDAo.getAccName(); 
		String num= theAccountDAo.getAccNum();
		

		MembershipDAo theMembershipDAO= context.getBean("membershipDAo", MembershipDAo.class);
		theMembershipDAO.addMember();
		theMembershipDAO.Hi();
		
		context.close();
	}
}
