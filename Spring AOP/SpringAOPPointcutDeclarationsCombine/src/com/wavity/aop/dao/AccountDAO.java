package com.wavity.aop.dao;

import org.springframework.stereotype.Component;

import com.wavity.aop.Account;

@Component
public class AccountDAO {
	
	private String AccName;
	private String AccNum;
	
	public String getAccName() {
		System.out.println(getClass()+ "  in getAccName()");
		return AccName;
	}

	public void setAccName(String accName) {
		System.out.println(getClass()+ " in setAccName()");
		AccName = accName;
	}

	public String getAccNum() {
		System.out.println(getClass()+ " in getAccNum()");
		return AccNum;
	}

	public void setAccNum(String accNum) {
		System.out.println(getClass()+ " in setAccNum()");
		AccNum = accNum;
	}

	public String addAccount(Account theAccount, boolean VipFlag){
		System.out.println(getClass()+ "   Doing my DB work- Adding Account");
		return "AcountID";
	}
	
	public boolean doWork(){
		System.out.println("Doing Work");
		return true;
	}
	
}
