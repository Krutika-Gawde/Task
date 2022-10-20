package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.bo.ProductBo;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.model.HealthCheck;
import com.example.demo.model.ProductVo;
@Component("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductBo productBo;
	
	@Autowired
	private ProductMapper productMapper;
	
	
	Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);
	
	
	@Override
	public List<ProductVo> getAllProductVo() {
		// TODO Auto-generated method stub
		logger.info("Retrieving data");
		return productMapper.toProductVos(productBo.getAllProduct());
	}

	@Override
	public ProductVo saveProductVo(ProductVo product) {
		// TODO Auto-generated method stub
		logger.info("Saving Product");
		return productMapper.toProductVo(productBo.saveProduct(productMapper.toProduct(product)));
	}

	@Override
	public HealthCheck healthcheck() {
		// TODO Auto-generated method stub
		logger.info("Healthcheck in progress");
		return productBo.healthcheck();
	}

}
