package com.niit.yamahaonlinebackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import javax.persistence.*;

@Entity
@Component
@Table(name = "UserOrder")
public class UserOrder {

	@Id
	private String Id;

	@Column(name = "Cart_Id")
	private String Cart_Id;

	@Column(name = "BillingAddress_Id")
	private String BillingAddress_Id;

	@Column(name = "ShippingAddress_Id")
	private String ShippingAddress_Id;

	@Column(name = "Pay_Method")
	private String Pay_method;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCart_Id() {
		return Cart_Id;
	}

	public void setCart_Id(String cart_Id) {
		Cart_Id = cart_Id;
	}

	public String getBillingAddress_Id() {
		return BillingAddress_Id;
	}

	public void setBillingAddress_Id(String billingAddress_Id) {
		BillingAddress_Id = billingAddress_Id;
	}

	public String getShippingAddress_Id() {
		return ShippingAddress_Id;
	}

	public void setShippingAddress_Id(String shippingAddress_Id) {
		ShippingAddress_Id = shippingAddress_Id;
	}

	public String getPay_method() {
		return Pay_method;
	}

	public void setPay_method(String pay_method) {
		Pay_method = pay_method;
	}

}
