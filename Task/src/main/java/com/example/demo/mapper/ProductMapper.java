package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.model.Product;
import com.example.demo.model.ProductVo;

@Mapper(componentModel = "Spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

	
	 Logger Logger = LoggerFactory.getLogger("mapper is mapping vo to dto");
		ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);
		List<ProductVo> toProductVos(List<Product> list);
		List<Product> toProducts(List<ProductVo> list);
		Product toProduct(ProductVo product);
		ProductVo toProductVo(Product product1);
	
}
