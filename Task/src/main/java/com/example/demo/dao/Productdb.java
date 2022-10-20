package com.example.demo.dao;

import java.util.List;


import com.example.demo.model.Product;


public interface Productdb {

	public List<Product> getAllProduct();
	public Product saveProduct(Product product);
	
	
}
