package com.niit.yamahaonlinebackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yamahaonlinebackend.DAO.UserOrderDAO;
import com.niit.yamahaonlinebackend.model.UserOrder;

import junit.framework.Assert;

public class UserOrderTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static UserOrderDAO userorderDAO;
	
	@Autowired
	static UserOrder userOrder;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userorderDAO = (UserOrderDAO) context.getBean("userorderDAO");
		userOrder =  (UserOrder) context.getBean("userOrder");
	}
	
	
	@Test
	public void CreateuserOrderTestCase()
	{
		userOrder.setId("UO-001");
		userOrder.setProduct_Name("Productname");
		userOrder.setProduct_Price(567);
		userOrder.setUser_Id("asdjksh");
		userOrder.setBillingAddress_Id("BA_001");
		userOrder.setShippingAddress_Id("SA_001");
		userOrder.setPay_method("Online");
		boolean status= userorderDAO.save(userOrder);
		Assert.assertEquals("CreateuserOrderTestCase", true, status);
	}

}
