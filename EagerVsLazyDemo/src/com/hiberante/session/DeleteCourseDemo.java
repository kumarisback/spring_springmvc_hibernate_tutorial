package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Course;
import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.student;


public class DeleteCourseDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {

			//begin transaction
			session.beginTransaction();
	
			//if we
			int id= 13;
			Course course=session.get(Course.class, id);
			
			
			session.delete(course);
			
			//we need to remove  link 
			
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			
			//it will handle connection leak issue
			session.close();
			factory.close();
		}
		

	}

}
