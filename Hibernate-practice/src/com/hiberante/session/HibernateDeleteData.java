package com.hiberante.session;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.student;


public class HibernateDeleteData {

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
			
			
			student s= session.get(student.class, "501");
			
			session.delete(s);
			
			
			//another way to delete the particular row
//			session.createQuery("delete from student where id='3' ").executeUpdate();
			session.getTransaction().commit();
			
			System.out.println("------------------------------");
			
			
			
			
		}
		catch(Exception e) {
			
		}
		finally {
			factory.close();
		}
		

	}


}
