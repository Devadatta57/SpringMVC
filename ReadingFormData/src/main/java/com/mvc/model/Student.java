package com.mvc.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
	@NotNull(message = "name cant be empty")
	private String name;
	@NotNull(message = "mail cant be empty")
	private String email;
	@NotNull(message = "rollno cant be empty")
	private String rollno;
	@Size(min=10,max=10,message = "mobile should be 10 digits")
	private String mobileno;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String department;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String email, String rollno, String mobileno, String department, String address) {
		super();
		this.name = name;
		this.email = email;
		this.rollno = rollno;
		this.mobileno = mobileno;
		this.department = department;
		this.address = address;
	}

	@Override
	public String toString() {
		return name+" "+email+" "+rollno+" "+mobileno+" "+department+" "+address; 
	}
	
	

}
