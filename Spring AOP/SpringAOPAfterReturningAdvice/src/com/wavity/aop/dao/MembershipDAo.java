package com.wavity.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAo {
	
	public void addMember(){
	System.out.println("Adding account to  membership DAO");	
	}
	public boolean Hi(){
		System.out.println("Hello!");
		return true;
	}
}
