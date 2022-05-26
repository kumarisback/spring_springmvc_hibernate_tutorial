package com.example;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	private FortuneService fortune;
	
	public SwimCoach(FortuneService f) {
		this.fortune=f;
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "i'm from swim team"+email+team;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
