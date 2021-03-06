package com.niit.yamahaonlinebackend.model;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Table(name="Product")
public class Product {
	
@Id	
private String Id;
	
@Column(name="name")
private String name;

@Column(name="price")
private int price;

@Column(name="Category_Id")
private String Category_Id;

@Column(name="Supplier_Id")
private String Supplier_Id;

@Column(name="stock")
private long stock;

@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="Category_Id",updatable=false,insertable=false,nullable=false)
private Category category;

@ManyToOne
@JoinColumn(name="Supplier_Id",nullable=false,insertable=false,updatable=false)
private Supplier supplier;

@Transient
private MultipartFile image;

@Transient
private String path ="D:\\DT NIIT\\yamahaonline\\ProductImages";






public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}





public MultipartFile getImage() {
	return image;
}

public void setImage(MultipartFile image) {
	this.image = image;
}

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

public long getStock() {
	return stock;
}

public void setStock(long stock) {
	this.stock = stock;
}


}
