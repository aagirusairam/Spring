package com.wavity;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Lucky Day!";
	}

}
