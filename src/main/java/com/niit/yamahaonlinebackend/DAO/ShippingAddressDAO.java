package com.niit.yamahaonlinebackend.DAO;

import com.niit.yamahaonlinebackend.model.ShippingAddress;

public interface ShippingAddressDAO {
public boolean save(ShippingAddress shippingaddress);
public boolean delete(ShippingAddress shippingaddress);
public ShippingAddress get(String Id);	
	
}
