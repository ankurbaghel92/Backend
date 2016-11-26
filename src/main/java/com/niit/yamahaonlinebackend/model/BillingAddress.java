package com.niit.yamahaonlinebackend.model;

import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="BillingAddress")
public class BillingAddress {

	@Id
	private String Id;

	@Column(name="address_line1")
	private String address_line1;
	
	@Column(name="address_line2")
	private String address_line2;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private String pincode;
	
	@OneToMany(mappedBy="billingAddress")
	private Set<UserOrder> userOrder;
	
	

	public Set<UserOrder> getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(Set<UserOrder> userOrder) {
		this.userOrder = userOrder;
	}
	

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
