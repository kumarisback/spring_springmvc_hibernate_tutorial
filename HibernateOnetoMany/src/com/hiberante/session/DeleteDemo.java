package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.student;


public class DeleteDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {

			//begin transaction
			session.beginTransaction();
	
			int theId=1;
			Instructor inst=session.get(Instructor.class, theId);
			
			if(inst!=null) {
				System.out.println(inst+"-----------------------------");
				session.delete(inst);
			}
			
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
