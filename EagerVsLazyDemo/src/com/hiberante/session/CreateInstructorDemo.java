package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Course;
import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.student;


public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
	
			session.beginTransaction();
			//save transaction
			int id=1;
			
			Instructor inst=session.get(Instructor.class, id);
			
			Course c1= new Course("title1");
			Course c2= new Course("title2");
			
			inst.add(c1);
			inst.add(c2);
			
			
			session.save(c1);
			session.save(c2);			
			
			
			
			
			//commit transaction
			session.getTransaction().commit();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			factory.close();
		}
		

	}

}
