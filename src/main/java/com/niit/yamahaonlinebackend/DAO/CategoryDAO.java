package com.niit.yamahaonlinebackend.DAO;

import java.util.List;

import com.niit.yamahaonlinebackend.model.Category;

public interface CategoryDAO {
	
	public boolean save(Category category);		//To insert a Category
	
	public boolean update(Category category);	//To update a Category
	
	public boolean delete(Category category);	//To delete a Category
	
	public Category get(String id);			    //To get Category of Particular Id
	
	public List<Category> list();				//To get whole Category table
}
