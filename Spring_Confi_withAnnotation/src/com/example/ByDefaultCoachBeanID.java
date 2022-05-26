package com.example;

import org.springframework.stereotype.Component;

@Component
public class ByDefaultCoachBeanID implements Coach {

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "i'm from default";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
