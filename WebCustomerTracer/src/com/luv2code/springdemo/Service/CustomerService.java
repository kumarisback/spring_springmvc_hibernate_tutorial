package com.luv2code.springdemo.Service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);


	public Customer getCustomers(int id);

	public void deleteCustomer(int id);

}
