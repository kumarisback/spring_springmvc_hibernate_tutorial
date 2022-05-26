package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class FormController {

	
	@RequestMapping("/form")
	public String formPage() {
		return "form-page";
		
	}
	
	@RequestMapping("/processform")
	public String processPage() {
		return "processform";	
	}
	
	
	@RequestMapping("/processform2")
	public String ReadData(HttpServletRequest request ,Model model) {
		
		String name=request.getParameter("studentName");
		
		name=name.toUpperCase()+ " yo ho";
		
		model.addAttribute("message",name);
		return "main-menu";	
	}
	

	
	//requestparam for getting param from the web page

	@RequestMapping("/processform3")
	public String processform3(@RequestParam("studentName")String name,Model model) {
		
		
		name=name.toUpperCase()+ "  you are using request param";
		
		model.addAttribute("message",name);
		return "main-menu";	
	}
}
