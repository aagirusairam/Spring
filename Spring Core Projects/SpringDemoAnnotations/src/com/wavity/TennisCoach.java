package com.wavity;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

}
