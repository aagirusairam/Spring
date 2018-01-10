package com.wavity;

public class BaseBallCoach<String> implements Coach{
	// define a private field for dependency
	private FortuneService fortuneService;
	//define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneService= theFortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
