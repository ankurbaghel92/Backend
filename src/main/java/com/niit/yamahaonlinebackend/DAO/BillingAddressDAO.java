package com.niit.yamahaonlinebackend.DAO;

import com.niit.yamahaonlinebackend.model.BillingAddress;

public interface BillingAddressDAO {
	
public boolean save(BillingAddress billingaddress);
public boolean delete(BillingAddress billingaddress);
public BillingAddress get(String Id);

	
}
