package com.example.demo.service;

import java.util.List;

import com.example.demo.model.HealthCheck;
import com.example.demo.model.ProductVo;



public interface ProductService {
 public List<ProductVo> getAllProductVo();
 public ProductVo saveProductVo(ProductVo product);
 public HealthCheck healthcheck();
}
