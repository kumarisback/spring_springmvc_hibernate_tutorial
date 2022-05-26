package com.pack.name;

public class trackCoach implements Coach {
	private FortuneService fortune;

	public trackCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String workOut() {
		
		return "i'm in track";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "hi"+fortune.getDailyFortune();
	}

	public trackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void intializr() {
		System.out.println("i'm inside intializr");
	}
	
	public void destroer() {
		System.out.println("i'm inside destroer");
	}

}
