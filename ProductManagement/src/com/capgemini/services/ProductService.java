package com.capgemini.services;

import java.util.List;

import com.capgemini.beans.Product;
import com.capgemini.exception.ProductException;

public interface ProductService {

	Product acceptProductDetails(Product product)throws ProductException;

	Product getProductDetails(Integer productID)throws ProductException;

	List<Product> getAllProductDetails() throws ProductException;

	Product acceptFacultyDetails(Product product) throws ProductException;

}
