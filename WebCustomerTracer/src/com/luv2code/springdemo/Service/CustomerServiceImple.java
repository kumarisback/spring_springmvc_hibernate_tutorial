package com.luv2code.springdemo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;


@Service
public class CustomerServiceImple implements CustomerService {

	
	
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
		
	
	}
	@Override
	@Transactional
	public Customer getCustomers(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers(id);
	}
	@Override
	@Transactional
	public void deleteCustomer(int id) {
		
		
		customerDAO.deleteCustomer(id);
		
		
		
	}
	

}
