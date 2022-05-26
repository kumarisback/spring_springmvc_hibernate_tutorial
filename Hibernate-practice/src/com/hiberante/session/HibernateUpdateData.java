package com.hiberante.session;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.student;


public class HibernateUpdateData {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
			//both getResultList and list do the same thing   list is older version that's it
			//begin transaction
			session.beginTransaction();
			
			int id=1;
			//commit transaction
			System.out.println("------------------------------");
			student s=session.get(student.class, "1");
			
			
			System.out.println("------------------------------");
			s.setFirstName("ulu");
			
			
			
			session.getTransaction().commit();
			System.out.println("------------------------------");
			
			Session session2=factory.getCurrentSession();
			session2.beginTransaction();
			
			
			//this query is to update table content for all row
			
			session2.createQuery("update student set emil='arun@gmail.com'").executeUpdate();

			session2.getTransaction().commit();
			System.out.println("------------------------------");
			
			
		}
		catch(Exception e) {
			
		}
		finally {
			factory.close();
		}
		

	}


}
