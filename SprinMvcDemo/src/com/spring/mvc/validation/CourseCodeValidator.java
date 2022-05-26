package com.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode,String>{

	
	private String coursePrefix;
	@Override
	public void initialize(CourseCode courseCode) {
		// TODO Auto-generated method stub
		coursePrefix =courseCode.Value();
		}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		boolean result;
		
		if(theCode !=null)
			result=theCode.startsWith(coursePrefix);
		else
			result = true;
		return result;
	}

}
