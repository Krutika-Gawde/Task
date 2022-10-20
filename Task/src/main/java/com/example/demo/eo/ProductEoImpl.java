package com.example.demo.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Productdb;
import com.example.demo.model.Product;
@Component("productEo")
public class ProductEoImpl implements ProductEo{

	@Autowired
	private Productdb productDb;
	
	Logger logger = LoggerFactory.getLogger(ProductEo.class);
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		logger.info("Retrieving data");
		return productDb.getAllProduct();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		logger.info("Save Product");
		return productDb.saveProduct(product);
	}

}
