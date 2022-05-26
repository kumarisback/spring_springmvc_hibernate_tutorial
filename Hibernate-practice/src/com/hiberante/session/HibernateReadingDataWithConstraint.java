package com.hiberante.session;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.student;


public class HibernateReadingDataWithConstraint {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
			//both getResultList and list do the same thing   list is older version that's it
			//begin transaction
			session.beginTransaction();
			
			List<student> studentList=session.createQuery("from student").getResultList();
			
			
			displayStudent(studentList);
			
			
			System.out.println( "---------------------------------");
			
			//with some  constraint
			List<student> studentList2=session.createQuery("from student where id=501").list();
			
			
			//condition
			
			//from student s were  s.lastname="doe:  OR s.firstname="john" or s.email LIKE '%luv2code.com';
			
			
			displayStudent(studentList2);
			
			
			
			//commit transaction
			session.getTransaction().commit();
			
			
			
		}
		catch(Exception e) {
			
		}
		finally {
			factory.close();
		}
		

	}

	private static void displayStudent(List<student> studentList) {
		for(student s:studentList) {
			System.out.println(s);
		}
	}

}
