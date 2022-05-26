package com.pack.name;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycleDemo2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new  ClassPathXmlApplicationContext("beanlifecycle-applicationcontext.xml");
		
		Coach c1=c.getBean("beanlifecycle",Coach.class);
		
//		Coach c2=c.getBean("beanscopedemo",Coach.class);
		
		
		
		System.out.println(c1.workOut());
		
		
		c.close();
		
		// TODO Auto-generated method stub

	}

}
