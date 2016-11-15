/*package com.niit.yamahaonlinebackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.yamahaonlinebackend.DAO.BillingAddressDAO;
import com.niit.yamahaonlinebackend.model.BillingAddress;

@ComponentScan("billingaddressDAO")
public class BillingAddressDAOIMPL implements BillingAddressDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	

	public BillingAddressDAOIMPL() {
		super();
	}

public BillingAddressDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(BillingAddress billingaddress) {
		try {
			if (get(billingaddress.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().save(billingaddress);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}

	public boolean delete(BillingAddress billingaddress) {
		try {
			if (get(billingaddress.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().delete(billingaddress);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public BillingAddress get(String Id) {
		return (BillingAddress) sessionFactory.getCurrentSession().get(BillingAddress.class, Id);
	}

}
*/