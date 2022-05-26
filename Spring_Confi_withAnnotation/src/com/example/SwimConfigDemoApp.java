package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new  AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach c= context.getBean("yourId",Coach.class);
		

		System.out.println(c.getDetails());
		System.out.println(c.getDailyFortune());
//		System.out.println();
		
		
		//if you dont give an id to your bean then by default its it will be same as class name but first letter of that class will me small
		//like if classname is TennisCoach  then id will be tennisCoach
		
//		Coach c1= context.getBean("byDefaultCoachBeanID4",Coach.class);
//		
//		
//		System.out.println(c1.getDetails());
		
		context.close();

	}

}
