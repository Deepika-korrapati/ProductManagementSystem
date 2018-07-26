package com.capgemini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.beans.Product;

public interface daoServices extends JpaRepository<Product, Integer>{

}
