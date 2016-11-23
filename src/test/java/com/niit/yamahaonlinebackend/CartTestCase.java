package com.niit.yamahaonlinebackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yamahaonlinebackend.DAO.CartDAO;
import com.niit.yamahaonlinebackend.model.Cart;

import junit.framework.Assert;

public class CartTestCase {

	@Autowired
	static Cart cart;
	
	@Autowired
	static CartDAO cartDAO;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		cart = (Cart) context.getBean("cart");
		cartDAO = (CartDAO) context.getBean("cartDAO");
		
	}
	
	@Test
	public void CreateCartTestCase()
	{
		cart.setId("001");
		cart.setProduct_Id("P001");
		cart.setQuantity(2);
		cart.setPrice(3000);
		boolean status = cartDAO.Save(cart);
		Assert.assertEquals("CreateCartTestCase", true, status);
		}

	
	//@Test
	public void DeleteCartTestCase()
	{
		cart.setId("001");
		boolean status = cartDAO.delete(cart);
		Assert.assertEquals("DeleteCartTestCase", true, status);
	}
	
	//@Test
	public void GetCartTestCase()
	{
		Assert.assertEquals("GetCartTestCase", 1, cartDAO.get("001"));
		
	}
	
}

	
	
	
	
	
	
	