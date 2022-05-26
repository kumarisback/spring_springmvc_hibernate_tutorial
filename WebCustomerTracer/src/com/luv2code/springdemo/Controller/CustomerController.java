package com.luv2code.springdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.Service.CustomerService;
import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the customer dao
	
//	@Autowired
//	private CustomerDAO customerDAO;
	
	//NEED TO INJECT CUSTOMER SERVICE
	@Autowired
	private CustomerService customerServices;
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
		List<Customer> theCustomers=customerServices.getCustomers();
		model.addAttribute("customers",theCustomers);
		return "list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model m) {
		
		Customer customer=new Customer();
		m.addAttribute("customer",customer);
		return "customer-form";
		
	}
	
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerServices.saveCustomer(theCustomer);
		
		//use to redirect 
		return "redirect:/customer/list";
	}
	@RequestMapping("/showFromForUpdate")
	public String showFromForUpdate(@RequestParam("id") int id,Model m) {
		
		
		Customer theCustomer =customerServices.getCustomers(id);
		m.addAttribute("customer",theCustomer);
		
		return "update-customer";
	}

	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int id,Model m) {
		
		
		customerServices.deleteCustomer(id);
		
		return "redirect:/customer/list";
	}
}
