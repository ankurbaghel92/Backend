package com.niit.yamahaonlinebackend;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yamahaonlinebackend.DAO.UserDAO;
import com.niit.yamahaonlinebackend.model.User;

import junit.framework.Assert;

public class UserTestCase {

	
	@Autowired
	static User user;
	
	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{	
		context  = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
	}
	
	@Test
	public void CreateuserTestCase()
	{
		/*user.setId("Y001");
		user.setDescription("Yamaha");
		user.setName("FZ1");
		*/boolean status = userDAO.save(user);
		Assert.assertEquals("Create user Test Case", true, status);
		
	}
		@Test
	public void DeleteuserTestCase()
	{
		user.setUserId("Y001");
		boolean status = userDAO.delete(user);
		Assert.assertEquals("Delete user Test Case", true, status);
	
	}

	@Test
	public void UpdateuserTestCase()
	{
		boolean status = userDAO.update(user);
		Assert.assertEquals("Update user Test Case", true, status);
		
	}
	
	@Test
	public void GetuserTestCase()
	{
		Assert.assertEquals("Get One user Test Case", null, userDAO.get("Y001"));
	}

	@Test
	public void GetAlluserTestCase()
	{
		Assert.assertEquals("Get All user Test Case", 1, userDAO.list().size());
		
	}
	
}
