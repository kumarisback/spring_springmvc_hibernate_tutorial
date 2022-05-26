package com.pack.name;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new  ClassPathXmlApplicationContext("beans-scopedemo.xml");
		
		Coach c1=c.getBean("beanscopedemo",Coach.class);
		
		Coach c2=c.getBean("beanscopedemo",Coach.class);
		
		
		
		System.out.println(c1==c2);
		System.out.println(c1);
		System.out.println(c2);
		
		c.close();
		
		// TODO Auto-generated method stub

	}

}
