package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class StudentController {
	@RequestMapping("/showForm")
	public String ShowForm(Model model) {
		Student student= new Student();
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processregistraion")
	public String processform(@ModelAttribute("student") Student s) {
		
		System.out.println(s.getFirstName()+s.getLastName());
		
		return "student-confirmation";
	}

}
