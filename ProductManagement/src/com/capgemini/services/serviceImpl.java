package com.capgemini.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.beans.Product;
import com.capgemini.exception.ProductException;
import com.capgemini.repo.daoServices;

@Component
public class serviceImpl implements ProductService {
	@Autowired
	private daoServices dao;

	@Transactional
	@Override
	public Product acceptProductDetails(Product product) throws ProductException {
		return dao.save(product);
	}

	
//updating the existing products
	@Override
	public Product getProductDetails(Integer productID) throws ProductException {
		Product product = dao.findOne(productID);
		if(product==null)throw new ProductException("Faculty Details with Id "+productID+" not found" );
		return product;
	}


//show all products present in database
	@Override
	public List<Product> getAllProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		return (List<Product>) dao.findAll();
	}


	@Override
	public Product acceptFacultyDetails(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return dao.save(product);
	}

}
