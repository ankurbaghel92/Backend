package com.niit.yamahaonlinebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

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
@Column(name = "mobile")
	private String mobile;

@NotBlank(message="Please Enter your Email Id")
@Column(name = "email")
	private String email;

@NotBlank(message="Please Enter your Password")
@Min(5)
@Max(15)
@Column(name = "password")
	private String password;

@NotBlank(message="Please Enter the Address1 field")
private String address1;

@NotBlank(message="Please Enter the Address2 field")
private String address2;

@NotBlank(message="Please Enter the City")
private String city;

@NotBlank(message="Please Enter the State")
private String state;

@NotBlank(message="Please Enter the Pincode")
private String pincode;


@Column(name = "address")
	private String address;

@Id
private String userId=email;


	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userid) {
		this.userId = userid;
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
		this.password = password;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address+= address1+" "+address2+" "+city+" "+state+" "+pincode;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
