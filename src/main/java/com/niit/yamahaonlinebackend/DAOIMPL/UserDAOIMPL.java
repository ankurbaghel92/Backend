/*package com.niit.yamahaonlinebackend.DAOIMPL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.niit.yamahaonlinebackend.DAO.UserDAO;
import com.niit.yamahaonlinebackend.model.User;

@ComponentScan("userDAO")
public class UserDAOIMPL implements UserDAO{

	@Autowired SessionFactory sessionFactory;
	
	public UserDAOIMPL(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	
	public boolean save(User user) {
		
		try
		{
			if(get(user.getUserId())!=null)
					return false;
		
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		
		catch(Exception e)
		{
		e.printStackTrace();	
				return false;
	}
	}
	
		
	public boolean delete(User user) {
		try
		{
		if(get(user.getUserId())!=null)
		{
			return false;
		}
		sessionFactory.getCurrentSession().delete(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return  false;
		}
		}
	
	public boolean update(User user) {
		try
		{
			if(get(user.getUserId())!=null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			
		e.printStackTrace();
		return false;
	}
	}
	
	public User get(String UserId) {
return (User) sessionFactory.getCurrentSession().get(User.class, UserId) ;
		
	}

	
	public List<User> list() {
		String hql = "FROM User";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
*/