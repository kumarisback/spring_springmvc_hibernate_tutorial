package com.pack.name;

public class CricketCoach  implements Coach{
	
	public CricketCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	//private object of interface
	private FortuneService fortune;
	
	public CricketCoach(FortuneService theFortune) {
		fortune=theFortune;
	}
	
	
	@Override
	public String workOut() {
		return "spend 30 mina day";

	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}
	
}
