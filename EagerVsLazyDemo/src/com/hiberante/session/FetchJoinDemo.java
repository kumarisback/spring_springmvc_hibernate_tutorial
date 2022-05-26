package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.eg.Course;
import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.student;


public class FetchJoinDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
//			create student object
			//begin transaction
			session.beginTransaction();
	
			//if we
			int id= 1;
			
			
			//
			
			Query<Instructor> query=session.createQuery("select i from Instructor i"+" FETCH ALL PROPERTIES" +" where i.id=:theInstructorId",Instructor.class);
			
			
			
			query.setParameter("theInstructorId", id);
			
			Instructor inst =query.getSingleResult();
			//commit transaction
			session.getTransaction().commit();
			
			session.close();
			System.out.println("session closed");
			//GET COURSES
			System.out.println("courses"+inst.getCourses());
			
			System.out.println("DONE");
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			factory.close();
		}
		

	}

}
