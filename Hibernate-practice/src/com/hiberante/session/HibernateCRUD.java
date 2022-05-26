package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.student;


public class HibernateCRUD {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
//			create student object
			
			student tempStudent = new student("arun","kumar","ark.xyz,com");
			
			//begin transaction
			session.beginTransaction();
			//save transaction
			session.save(tempStudent);
			//commit transaction
			session.getTransaction().commit();
		}
		catch(Exception e) {
			
		}
		finally {
			factory.close();
		}
		

	}

}
