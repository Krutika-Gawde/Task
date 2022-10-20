package com.example.demo.bo;

import java.util.List;
import javax.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import com.example.demo.eo.ProductEo;
import com.example.demo.exception.TableNotFoundException;
import com.example.demo.model.HealthCheck;
import com.example.demo.model.Product;

@Service("hardwareBo")
public class ProductBoImpl implements ProductBo {

	@Autowired
	private ProductEo productEo;
	

	
	Logger logger = LoggerFactory.getLogger(ProductBoImpl.class);
	
	@Transactional
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		logger.info("Getting products");
		return productEo.getAllProduct();
	}

	@Transactional
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
	
		logger.info("Saving Products");
		return productEo.saveProduct(product);
	}

	@Override
	public HealthCheck healthcheck() throws TableNotFoundException{
		// TODO Auto-generated method stub
		HealthCheck healthcheck= new HealthCheck();
		healthcheck.setHealthComment("Check table is available in db");
		try {
			if(getAllProduct()!=null)
			{
				healthcheck.setHealthStatus("Success");
				healthcheck.setHealthDescription("Table is available");
			}
		}
		catch(BadSqlGrammarException ex)
		{
		healthcheck.setHealthStatus("Failure");
		healthcheck.setHealthDescription("Table is not available");
		}
		return healthcheck;
	}

}
