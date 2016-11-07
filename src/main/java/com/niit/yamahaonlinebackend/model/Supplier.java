package com.niit.yamahaonlinebackend.model;

import javax.persistence.*;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Supplier {
	
	@Id
	private String Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public String getId() {
		return Id;
	}


	
	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
