package com.hiberante.session;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.eg.Course;
import com.hibernate.eg.Instructor;
import com.hibernate.eg.InstructorDetail;
import com.hibernate.eg.Review;
import com.hibernate.eg.student;


public class CreateCourseAndStudentDemo {

	public static void main(String[] args) {
		
		
//		
		//create session factory
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(student.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Review.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
			session.beginTransaction();
			
			Course c=new Course("hi im new here");
			
			session.save(c);
			
			
			student s1= new student("john", "doe","ak@com");
			student s2= new student("kali", "doe","ak@com");
			student s3= new student("pele", "doe","ak@com");
			
			c.addStudent(s3);
			c.addStudent(s2);
			c.addStudent(s1);
			
			System.out.println("courses"+c);
			
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			
			System.out.println("student"+c.getStudents());
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
