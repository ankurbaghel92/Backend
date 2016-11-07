package com.niit.yamahaonlinebackend.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Expectations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.model.Category;

@Repository("categoryDAO")
public class CategoryDAOIMPL implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;

	public CategoryDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

	public boolean update(Category category) {
		
	try{
		sessionFactory.getCurrentSession().update(category);
		return true;
	}
	catch(Exception e)
	{		
System.out.println(e);

		return false;
	}
	}
	public boolean delete(Category category) {

		return false;
	}

	public Category get(String id) {

		return null;
	}

	public List<Category> list() {

		return null;
	}

}
