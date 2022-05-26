package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Course;
import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.Review;
import com.hibernate.eg.student;


public class GetCoursesForKaliDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(student.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Review.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			
			int id=2;
			student s=session.get(student.class, "2");
			
			System.out.println(s+"student");
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
