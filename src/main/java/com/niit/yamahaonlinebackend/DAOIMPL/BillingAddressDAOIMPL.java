package com.niit.yamahaonlinebackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.yamahaonlinebackend.DAO.BillingAddressDAO;
import com.niit.yamahaonlinebackend.model.BillingAddress;

@Repository("billingaddressDAO")
public class BillingAddressDAOIMPL implements BillingAddressDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public BillingAddressDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

   @Transactional
	public boolean save(BillingAddress billingaddress) {
		try {
			/*if (get(billingaddress.getId()) != null) {
				return false;
			}*/
			sessionFactory.getCurrentSession().save(billingaddress);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

@Transactional
	public boolean delete(BillingAddress billingaddress) {
		try {
			/*if (get(billingaddress.getId()) != null) {
				return false;
			}*/
			sessionFactory.getCurrentSession().delete(billingaddress);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

@Transactional
	public BillingAddress get(String Id) {
		return (BillingAddress) sessionFactory.getCurrentSession().get(BillingAddress.class, Id);
	}

}
