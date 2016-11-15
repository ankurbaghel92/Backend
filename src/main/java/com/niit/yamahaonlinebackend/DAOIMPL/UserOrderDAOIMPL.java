/*package com.niit.yamahaonlinebackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.yamahaonlinebackend.DAO.UserDAO;
import com.niit.yamahaonlinebackend.DAO.UserOrderDAO;
import com.niit.yamahaonlinebackend.model.UserOrder;

@ComponentScan("userorderDAO")
public class UserOrderDAOIMPL implements UserOrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public UserOrderDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(UserOrder userDAO) {
		try {
			if (get(userDAO.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().save(userDAO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean delete(UserOrder userDAO) {
		try {
			if (get(userDAO.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().delete(userDAO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}

	}

	public UserOrder get(String Id) {
		return (UserOrder) sessionFactory.getCurrentSession().get(UserOrder.class, Id);
	}

}
*/