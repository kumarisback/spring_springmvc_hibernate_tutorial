package com.pack.name;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring conatiner 
		Coach c=context.getBean("mycoach", Coach.class);
		
		
		//call method
		
		System.out.println(c.workOut());
		System.out.println(c.getFortune());
		
		//close context
		context.close();

	}

}
