/*package com.niit.yamahaonlinebackend.DAOIMPL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.niit.yamahaonlinebackend.DAO.ProductDAO;
import com.niit.yamahaonlinebackend.model.Product;

@ComponentScan("productDAO")
public class ProductDAOIMPL implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public ProductDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(Product product) {
		try {
			if (get(product.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Product product) {
		try {
			if (get(product.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public boolean update(Product product) {
		try {
			if (get(product.getId()) != null) {
				return false;
			}
			sessionFactory.getCurrentSession().update(product);
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Product get(String Id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, Id);

	}

	public List<Product> list() {
		String hql = "FROM Product";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
*/