package com.example.demo.eo;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductEo {

	public List<Product> getAllProduct();
	public Product saveProduct(Product product);
	
}
