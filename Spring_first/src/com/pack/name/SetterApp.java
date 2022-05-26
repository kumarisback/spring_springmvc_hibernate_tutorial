package com.pack.name;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SetterExampleCouch c=context.getBean("passingLiteralsfromfile",SetterExampleCouch.class);
		
//		System.out.println(c.getFortune());
//		System.out.println(c.workOut());
//		c.setEmail("arun.com");
		System.out.println( c.getEmail());
		System.out.println( c.getName());
		
		context.close();
	}

}
