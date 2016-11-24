package com.niit.yamahaonlinebackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.DAO.SupplierDAO;
import com.niit.yamahaonlinebackend.model.Supplier;

import junit.framework.Assert;

public class SupplierTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired
	static Supplier supplier;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		supplier = (Supplier) context.getBean("supplier");
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
				
	}
	
	
	
	@Test
	public void CreateSupplierTestCase()
	{
		supplier.setId("SUP_001");
		supplier.setName("Supplier1");
		supplier.setDescription("Supplier");
		boolean status = supplierDAO.save(supplier);
	Assert.assertEquals("CreateSupplierTestCase", true, status);
	}
	
//	@Test
	public void UpdateSupplierTestCase()
	{
		supplier.setId("SUP_001");
		supplier.setName("Supplier");
		supplier.setDescription("newSupplier");
		boolean status = supplierDAO.udpate(supplier);
		Assert.assertEquals("updateSupplierTestCase", true, status);
	}
	
	//@Test
	public void deleteSupplierTestCase()
	{
	supplier.setId("SUP_001");
	boolean status = supplierDAO.delete(supplier);
	Assert.assertEquals("DeleteSupplierTestCase", true, status);
	}
	
	//@Test
	public void GetSupplierTestCase()
	{
	Assert.assertEquals("GetSupplierTestCase",null, supplierDAO.get("SUP_001"));	
	}
	
	//@Test
	public void GetAllCategoryTestCase()
	{
		Assert.assertEquals("Get All Category Test Case", 1, supplierDAO.list().size());
		
	}
	
	//@Test
	public void test() {
		fail("Not yet implemented");
	}

}
