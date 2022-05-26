package com.spring.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy= CourseCodeValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	
	
//here define your value 
	
	public String Value() default "LUV";
	
	public String message() default "must start with LUV";
	
	
	
	//GROUPS is retlated to constraint
	
	public Class<?>[] groups() default {};
	
	
	//it provide detail about validation failure , severity level, error code
	
	public Class<? extends Payload>[] payload() default {};
	

}
