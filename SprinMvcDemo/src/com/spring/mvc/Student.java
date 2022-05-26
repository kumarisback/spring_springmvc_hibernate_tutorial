package com.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName="";
	private String lastName="";
	private String country="";
	private String favLanguage="";
	private String[] os;
	
	

	public String[] getOs() {
		return os;
	}
	public void setOs(String[] os) {
		this.os = os;
	}
	public String getFavLanguage() {
		return favLanguage;
	}
	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	private LinkedHashMap <String,String> countryOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("k1","india");
		
		countryOptions.put("k2","canda");
		countryOptions.put("k3","brazil");
		countryOptions.put("k4","mera desh");
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
