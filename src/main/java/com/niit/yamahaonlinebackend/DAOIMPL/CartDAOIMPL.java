/*package com.niit.yamahaonlinebackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.yamahaonlinebackend.DAO.CartDAO;
import com.niit.yamahaonlinebackend.model.Cart;

@ComponentScan("cartDAO")
public class CartDAOIMPL implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;

	public CartDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public boolean Save(Cart cart) {
		try {
			if (get(cart.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().save(cart);
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Transactional
	public boolean delete(Cart cart) {
		try {
			if (get(cart.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Cart get(String Id) {

		return (Cart) sessionFactory.getCurrentSession().get(Cart.class, Id);
	}

}
*/