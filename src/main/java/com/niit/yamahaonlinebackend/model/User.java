package com.niit.yamahaonlinebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "User")
public class User {
	

	public User(){
		
		System.out.println("User");
	}

@NotBlank(message="Please Enter your First Name")
@Column(name = "fname")
private String fname;

@NotBlank(message="Please Enter your Last Name")
@Column(name = "lname")
	private String lname;

@NotBlank(message="Please Enter your Mobile Number")
@Pattern(regexp="(^$|[0-9]{10})",message="Mobile Number should be only numbers")
@Column(name = "mobile")
	private String mobile;  

@Id
@NotBlank(message="Please Enter your Email Id")
@Column(name = "email")
	private String email;

@NotBlank(message="Password and Confirm Password Does not match")
@Size(min=5,max=10,message="Password size must be between 5 to 10")
@Column(name = "password")
	private String password;




private String role;

@Transient
private String ComPassword;
	




public String getComPassword() {
	return ComPassword;
}
public void setComPassword(String comPassword) {
	ComPassword = comPassword;
}


public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {

		return password;
	}
	public void setPassword(String password) {
		if(password.equals(ComPassword))
		{
			this.password = password;
		}
		else
			this.password=null;
	}
	
	
}
