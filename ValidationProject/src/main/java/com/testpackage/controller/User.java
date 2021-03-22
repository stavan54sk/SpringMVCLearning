package com.testpackage.controller;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;


public class User {

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@NotEmpty
	private String username;
	
	
	@NotEmpty
	@Size(max=10, min=6) 
	private String pwd;
	
	@NotEmpty
	@Email
	private String email;
	
	
	 @NotNull
	 @DateTimeFormat(pattern="dd/MM/yyyy")
	 @Past
	private Date dob;
	 
	@NotEmpty
	@Pattern(regexp="91-[0-9]{10}")
	private String mobile;

	

}
