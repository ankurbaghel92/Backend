package com.niit.yamahaonlinebackend.model;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name="UserOrder")
public class UserOrder {
	
	public UserOrder()
	{
		System.out.println("UserOrder is created");
	}

	@Id
	private String Id;
	
	@Column(name="Product_Name")
	private String Product_Name;
	
	@Column(name="Product_price")
	private int Product_Price;
	
	@Column(name = "BillingAddress_Id")
	private String BillingAddress_Id;

	@Column(name = "ShippingAddress_Id")
	private String ShippingAddress_Id;

	@Column(name = "Pay_Method")
	private String Pay_method;
	
	@Column(name="User_Id")
	private String User_Id;
	
	@ManyToOne
	@JoinColumn(name="Id",updatable=false,insertable=false,nullable=false)
	private ShippingAddress shippingAddress;
	
	@ManyToOne
	@JoinColumn(name="Id",updatable=false,insertable=false,nullable=false)
	private BillingAddress billingAddress;
	
	
	
	

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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
	
	

}
