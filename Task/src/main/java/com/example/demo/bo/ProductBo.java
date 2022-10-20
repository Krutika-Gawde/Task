package com.example.demo.bo;

import java.util.List;

import com.example.demo.model.HealthCheck;
import com.example.demo.model.Product;

public interface ProductBo {
	public List<Product> getAllProduct();
	public Product saveProduct(Product product);
	public HealthCheck healthcheck();
}
