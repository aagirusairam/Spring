package com.wavity.aop.dao;

import org.springframework.stereotype.Component;
import com.wavity.aop.Account;

@Component
public class AccountDAO {
	
	public String addAccount(Account theAccount, boolean VipFlag){
		String AccountID= "ASDSES21545";
		System.out.println(getClass()+ "  \n Doing my DB work- Adding Account: "+AccountID);
		return "";
	}
	public boolean doWork(){
		System.out.println("Doing Work");
		return true;
	}	
}
