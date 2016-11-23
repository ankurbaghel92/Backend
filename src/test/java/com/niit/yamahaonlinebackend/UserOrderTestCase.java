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
	static UserOrder userorder;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userorderDAO = (UserOrderDAO) context.getBean("userorderDAO");
		userorder = (UserOrder) context.getBean("userorder");
	}
	
	
	@Test
	public void CreateUserOrderTestCase()
	{
		userorder.setId("UO-001");
		userorder.setBillingAddress_Id("billing address");
		userorder.setShippingAddress_Id("shippingAddress");
		userorder.setCart_Id("Cart-001");
		userorder.setPay_method("Online");
		boolean status= userorderDAO.save(userorder);
		Assert.assertEquals("CreateUserOrderTestCase", true, status);
	}

}
