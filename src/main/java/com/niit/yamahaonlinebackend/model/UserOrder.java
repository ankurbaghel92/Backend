package com.niit.yamahaonlinebackend.model;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

import java.io.Serializable;

import javax.persistence.*;

//@Entity
@Component
//@Table(name="UserOrder")
public class UserOrder implements Serializable {
	
	public UserOrder()
	{
		System.out.println("UserOrder is created");
	}

	
	//@Id
	private String Id;
	
	//@Column(name="Product_Name")
	private String Product_Name;
	
	//@Column(name="Product_price")
	private int Product_Price;
	

	//@Column(name = "Pay_Method")
	private PaymentMethod paymentMethod;
	
	//@Column(name="User_Id")
	private String User_Id;
	
	//@Column(name="ShippingAddress")
	private ShippingAddress shippingAddress;
	
	//@Column(name="BillingAddress")
	private BillingAddress billingAddress;
	
	
	
	

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	
	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public int getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_Price(int product_Price) {
		Product_Price = product_Price;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


}
