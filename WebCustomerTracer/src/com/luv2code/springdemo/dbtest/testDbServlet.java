package com.luv2code.springdemo.dbtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class testDbServlet
 */
@WebServlet("/testDbServlet")
public class testDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setup connection
		
		String user="springstudent";
		String pass="springstudent";
		String jdbcurl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		
		
		String driver= "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out=response.getWriter();
			Class.forName(driver);
			Connection myconn=DriverManager.getConnection(jdbcurl,user,pass);
			out.println("sucess");
			myconn.close();
			}
		catch(Exception e) {
			
		}
		
		
		
		
		
		
		
	}

}
