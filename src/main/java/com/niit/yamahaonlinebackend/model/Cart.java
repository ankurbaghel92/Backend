package com.niit.yamahaonlinebackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import javax.persistence.*;

@Entity
@Component
@Table(name = "Cart")
public class Cart {

	@Id
	private String Id;
	
	@Column(name="product_Id")
	private String Product_Id;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private int price;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getProduct_Id() {
		return Product_Id;
	}

	public void setProduct_Id(String product_Id) {
		Product_Id = product_Id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
