package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Course;
import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.Review;
import com.hibernate.eg.student;


public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Review.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			Course c=new Course("title3");
			
			c.addReview(new Review("Greate course"));
			c.addReview(new Review("happy"));
			c.addReview(new Review("sad"));
			
			session.save(c);
			
			System.out.println("course and reice"+c);
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
