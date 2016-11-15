package com.niit.yamahaonlinebackend.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name="BillingAddress")
public class BillingAddress {

	@Id
	private String Id;

	@Column(name = "Address")
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
