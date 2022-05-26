package com.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	//init binder will check about string which have white space or not before furture processing
	
	 @InitBinder
	 public void intiBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor s = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, s);
	 }
	
	@RequestMapping("/showForm")
	public String ShowForm(Model model) {
		Customer customer=new Customer();
		
		model.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	
	//valide attribute is used to avalidate the next parameter here its customer object , and 
	//bindingresult is used to store the result of validating
	@RequestMapping("/processcustomerform")
	public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer ,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else
			return "process-customer-form";
		
	}

}
