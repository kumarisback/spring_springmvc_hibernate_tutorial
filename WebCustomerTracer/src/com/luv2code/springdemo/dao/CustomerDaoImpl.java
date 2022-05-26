package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDAO {
	
	
	
	
	@Autowired
	private SessionFactory sessionFactory;


//	@Transactional
	@Override
	public List<Customer> getCustomers() {
		// get current hibernate session
		
		
		Session currentSession = sessionFactory.getCurrentSession();		
		
		//create query 
		
		Query<Customer> theQuery=currentSession.createQuery("from Customer order by lastName",Customer.class);
		
		//execute query
		
		List<Customer> customers=theQuery.getResultList();
		
		//result return
		
		
		
		
		return customers;
	}


	@Override
	public void saveCustomer(Customer theCustomer) {
		
		
		//GET SESSION
		Session currentSession = sessionFactory.getCurrentSession();
		
		System.out.println("hi");
		// SAVE CUSTOMER to insert new enter
//		currentSession.save(theCustomer);
		
		
		
		//using saveorupdate it primary key empty then insert new data else update the data
		currentSession.save(theCustomer);
		
	}


	@Override
	public Customer getCustomers(int id) {
		
		
		Session currentSession =sessionFactory.getCurrentSession();
		
		Customer theCustomer =currentSession.get(Customer.class, id);
		return theCustomer;
	}


	@Override
	public void deleteCustomer(int id) {
		
		Session currentSession =sessionFactory.getCurrentSession();
		
		Query q=currentSession.createQuery("delete from Customer where id=:customerId");
		
		q.setParameter("customerId", id);
		System.out.println("here");
		q.executeUpdate();
		
	}



}
