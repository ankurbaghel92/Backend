package com.niit.yamahaonlinebackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;


import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="ShippingAddress")
public class ShippingAddress {
	
	@Id
	private String Id;
	
	@Column(name="Addresss")
	private String address;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
