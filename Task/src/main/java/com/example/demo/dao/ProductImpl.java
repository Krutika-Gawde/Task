package com.example.demo.dao;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.demo.model.Product;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository("productDb")
public class ProductImpl implements Productdb{

	@Autowired
	JdbcTemplate jdbcTemplate1;
	
	Logger logger = LoggerFactory.getLogger(Productdb.class);
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		String query1="select * from productvo";
		logger.info("Find all the data");
		return jdbcTemplate1.query(query1,(rs,rowNum)->
		new Product(
				rs.getInt("productId"),
				rs.getString("productName")
		));
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		String query = "insert into productvo values('"+product.getProductId()+"','"+product.getProductName()+"')";
		jdbcTemplate1.update(query);
		logger.info("Creating");
		return product;
	}

	
}
