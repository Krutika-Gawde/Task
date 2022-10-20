package com.example.demo.controller;
import java.util.List;

import com.example.demo.bo.ProductBo;
import com.example.demo.bo.ProductBoImpl;
import com.example.demo.dao.Productdb;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.model.HealthCheck;
import com.example.demo.model.Product;
import com.example.demo.model.ProductVo;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@GetMapping("/product")
	public ResponseEntity<List<ProductVo>> getAllProductVo(){
	List<ProductVo> product=productService.getAllProductVo();
	if(product==null || product.isEmpty())
		return new ResponseEntity("Sorry! No  DB!", HttpStatus.NOT_FOUND);
	
	logger.info("Data is retriving");
	return ResponseEntity.ok(product);
} 

	@PostMapping("/product")
	public ResponseEntity<ProductVo> saveProductVo(@Validated @RequestBody ProductVo productvo){
		ProductVo product1=productService.saveProductVo(productvo);
		
		if(product1==null)
			return new ResponseEntity("Sorry! Insertion Error!" , HttpStatus.BAD_REQUEST);
		logger.info("Data is saving");
		return ResponseEntity.status(HttpStatus.OK).body(product1);
	}

	@GetMapping("/healthcheck")
	public ResponseEntity <HealthCheck> healthcheck(){
		HealthCheck healthcheck= productService.healthcheck();
		logger.info("Data is saving in db");
		return ResponseEntity.status(HttpStatus.OK).body(healthcheck);
	}
	
}
