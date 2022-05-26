package com.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	@CourseCode
	private String courseCode;
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	
	
	//if you want to make this integer the use use Integer not int otherwise it will give error
	@Min(value=18,message="min 1")
	@Max(value=60,message="max 60")
	@NotNull(message="is required")
	private Integer age;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}" ,message="must ony be  charater/digit")
	private String passWord;
	
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
