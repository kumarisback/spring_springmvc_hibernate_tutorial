package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.student;


public class DeleteInstructorDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {

			//begin transaction
			session.beginTransaction();
	
			//if we
			int id= 3;
			
			InstructorDetail inst=session.get(InstructorDetail.class, id);
			
			inst.getInstructor().setInstructordetail(null);
			//commit transaction
			session.delete(inst);
			
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
