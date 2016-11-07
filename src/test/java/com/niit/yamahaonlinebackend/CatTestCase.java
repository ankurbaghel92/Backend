package com.niit.yamahaonlinebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.model.Category;

import junit.framework.Assert;

public class CatTestCase {
	
	@Autowired
	Category category;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	AnnotationConfigApplicationContext context;
	
	public void init()
	{
		
		
		context  = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
	}
	
	
	public void CreateCategoryTestCase()
	{
		category.setId("Y001");
		category.setDescription("Yamaha");
		category.setName("FZ1");
		boolean status = categoryDAO.save(category);
		Assert.assertEquals("Create Category Test Case", true, status);
		
	}

}
