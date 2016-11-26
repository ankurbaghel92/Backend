package com.niit.yamahaonlinebackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.yamahaonlinebackend.DAO.UserOrderDAO;
import com.niit.yamahaonlinebackend.model.UserOrder;

@Repository("userorderDAO")
public class UserOrderDAOIMPL implements UserOrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public UserOrderDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(UserOrder userorder) {
		try {
			if (get(userorder.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().save(userorder);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
@Transactional
	public boolean delete(UserOrder userorder) {
		try {
			if (get(userorder.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().delete(userorder);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public UserOrder get(String Id) {
		return (UserOrder) sessionFactory.getCurrentSession().get(UserOrder.class, Id);
	}

}
