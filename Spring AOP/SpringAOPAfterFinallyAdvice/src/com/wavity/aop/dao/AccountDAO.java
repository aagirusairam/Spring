package com.wavity.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wavity.aop.Account;

@Component
public class AccountDAO {

	private String AccName;
	private String AccNum;

	public List<Account> findAccounts(boolean tripWire) {
		if (tripWire == true) // this will throw error because tripWire is true
		{
			throw new RuntimeException("Exception thrown at runtime");
		}
		List<Account> myAccounts = new ArrayList<Account>();
		// Create sample Accounts
		Account temp1 = new Account("John", "Emily");
		Account temp2 = new Account("Gardner", "Eular");
		Account temp3 = new Account("feroz", "lucad");

		// Add accounts to our AccountList
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);

		return myAccounts;
	}

	public String getAccName() {
		System.out.println(getClass() + "in  getAccName");
		return AccName;
	}

	public void setAccName(String accName) {
		System.out.println(getClass() + "in  setAccName");
		AccName = accName;
	}

	public String getAccNum() {
		System.out.println(getClass() + "in  getAccNum");
		return AccNum;
	}

	public void setAccNum(String accNum) {
		System.out.println(getClass() + "in  setAccNum");
		AccNum = accNum;
	}

	public String addAccount(Account theAccount, boolean VipFlag) {
		System.out.println(getClass() + "   Doing my DB work- Adding Account");
		return "";
	}

	public boolean doWork() {
		System.out.println("Doing Work");
		return true;
	}

}
