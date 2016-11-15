package com.niit.yamahaonlinebackend.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Product")
public class Product {
	
private String Id;
private String name;
private int price;
private String Category_Id;
private String Supplier_Id;
private int stock;

@ManyToOne
@JoinColumn(name="Category_Id",updatable=false,insertable=false,nullable=false)
private Category category;

@ManyToOne
@JoinColumn(name="Supplier_Id",nullable=false,insertable=false,updatable=false)
private Supplier supplier;


public String getId() {
	return Id;
}

public void setId(String id) {
	this.Id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getCategory_Id() {
	return Category_Id;
}

public void setCategory_Id(String category_Id) {
	Category_Id = category_Id;
}

public String getSupplier_Id() {
	return Supplier_Id;
}

public void setSupplier_Id(String supplier_Id) {
	Supplier_Id = supplier_Id;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}


}
