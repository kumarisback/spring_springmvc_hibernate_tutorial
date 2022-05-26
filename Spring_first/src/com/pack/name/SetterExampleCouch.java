package com.pack.name;

public class SetterExampleCouch implements Coach {
	
	private String email;
	private String name;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("we are inside set_email");
		this.email = email;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		System.out.println("we are inside set_name");
		this.name = name;
	}

	private FortuneService fortune;

	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String workOut() {
		// TODO Auto-generated method stub
		return "lets do some work OUT";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}

}
