package com.wavity.aop.dao;

import org.springframework.stereotype.Component;
import com.wavity.aop.Account;

@Component
public class AccountDAO {
	
	public String addAccount(Account theAccount, boolean VipFlag){
		System.out.println(getClass()+ "Doing my DB work- Adding Account");
		return "";
	}	
	public boolean doWork() {
	System.out.println("Doing some Work");
		return true;
	}
}
