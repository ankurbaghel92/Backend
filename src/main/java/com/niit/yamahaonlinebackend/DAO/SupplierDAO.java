package com.niit.yamahaonlinebackend.DAO;

import java.util.List;

import com.niit.yamahaonlinebackend.model.Supplier;

public interface SupplierDAO {
	
	public boolean save(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public boolean udpate(Supplier supplier);
	
	public Supplier get(String Id);
	
	public List<Supplier> list();

}
