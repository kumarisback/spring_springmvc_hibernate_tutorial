package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("yourId")
public class TableTennnisCoach implements Coach {
	//field injection quickest way 
	
	
	//always put first letter small in qualifier to pin out any class or interface
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	
	public TableTennnisCoach() {
		System.out.println("im inside constructor");
	}
	
	//setter injection
	//EXAMPLE FOR SETTER METHOD here you can give any name to setter function it will run 
	
	/*
	@Autowired
	public void setFortuneService(FortuneService f1) {
		System.out.println("inside setter method");
		fortuneService=f1;
		
	}
	*/
	
	/*constructor injection
	@Autowired
	public TableTennnisCoach(FortuneService f1) {
		fortuneService=f1;
	}
	*/

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		
		return "here is your details";

	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "i'm from ttcoach"+fortuneService.getFortune();
	}

}
