package com.hibernate.eg;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnetionTest {

	public static void main(String[] args) {
		
		String jdbcurl= "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user="root";
		String pass="root";
		
		try {
			System.out.println("  connected");
			Connection c =DriverManager.getConnection(jdbcurl,user,pass);

			System.out.println("  connected");
			
		}
		catch(Exception e) {
			System.out.println(" fail to connect");
		}
		// TODO Auto-generated method stub

	}

}
