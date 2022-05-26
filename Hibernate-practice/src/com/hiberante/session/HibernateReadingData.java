package com.hiberante.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.student;


public class HibernateReadingData {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
//			create student object
			
			student tempStudent = new student("avtar","kumar","avtar.xyz,com");
			
			//begin transaction
			session.beginTransaction();
			//save transaction
			session.save(tempStudent);
			//commit transaction
			session.getTransaction().commit();
			
			
			
			//reading the data
			
			session =factory.getCurrentSession();
			session.beginTransaction();
			
			
			
			//in get session the argument here is id means primary key
			student s = session.get(student.class, tempStudent.getId());
			
			session.getTransaction().commit();
			System.out.println(s.toString());
		}
		catch(Exception e) {
			
		}
		finally {
			factory.close();
		}
		

	}

}
