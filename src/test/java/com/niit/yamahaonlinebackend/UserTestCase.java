package com.niit.yamahaonlinebackend;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yamahaonlinebackend.DAO.UserDAO;
import com.niit.yamahaonlinebackend.model.Login;
import com.niit.yamahaonlinebackend.model.User;

import junit.framework.Assert;

public class UserTestCase {

	@Autowired
	static User user;
	
	@Autowired
	static Login login;

	@Autowired
	static UserDAO userDAO;

	@Autowired
	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		login = (Login) context.getBean("login");
	}

	@Test
	public void CreateuserTestCase() {

		user.setFname("sachin");
		user.setLname("Tendulkar");
		user.setMobile("112233445");
		user.setEmail("sachin.t@gmail.com");
		user.setPassword("SachinT");
		//user.setAddress("pune");
		user.setRole("User");
		boolean status = userDAO.save(user);
		Assert.assertEquals("Create user Test Case", true, status);

	}

	/*// @Test
	public void DeleteuserTestCase() {
		user.setUserId("Y001");
		boolean status = userDAO.delete(user);
		Assert.assertEquals("Delete user Test Case", true, status);

	}

*/	// @Test
	public void UpdateuserTestCase() {
		boolean status = userDAO.update(user);
		Assert.assertEquals("Update user Test Case", true, status);

	}

	// @Test
	public void GetuserTestCase() {
		Assert.assertEquals("Get One user Test Case", null, userDAO.get("Y001"));
	}

	// @Test
	public void GetAlluserTestCase() {
		Assert.assertEquals("Get All user Test Case", 1, userDAO.list().size());

	}

	//@Test
	public void IsValidUserTestCase()
	{
/*		Assert.assertEquals("asdsads", 1, userDAO.IsValidUser("ankur", "baghel"));
*/		User u = userDAO.IsValidUser("asdsjk", "baghel1");
		System.out.println(u.getFname());
		System.out.println(u.getRole());
		System.out.println(u.getMobile());
		System.out.println(u.getEmail());
		System.out.println(u.getLname());
		
		}
	
}
