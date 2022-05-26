package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.student;


public class CreateDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
//			create student object
			Instructor inst=new Instructor("avtar","kumar","avtar.com");
			
			InstructorDetail instDetail =new InstructorDetail("my youthube link","my hobby");
			
			//THIS WILL associate object  with the joincolumn and onetoone annotation used in table
			inst.setInstructordetail(instDetail);
			//begin transaction
			session.beginTransaction();
			//save transaction
			session.save(inst);
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
