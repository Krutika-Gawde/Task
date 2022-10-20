package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductVo;
import com.example.demo.mapper.ProductMapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-19T11:42:56+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public List<ProductVo> toProductVos(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductVo> list1 = new ArrayList<ProductVo>( list.size() );
        for ( Product product : list ) {
            list1.add( toProductVo( product ) );
        }

        return list1;
    }

    @Override
    public List<Product> toProducts(List<ProductVo> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ProductVo productVo : list ) {
            list1.add( toProduct( productVo ) );
        }

        return list1;
    }

    @Override
    public Product toProduct(ProductVo product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setProductId( product.getProductId() );
        product1.setProductName( product.getProductName() );

        return product1;
    }

    @Override
    public ProductVo toProductVo(Product product1) {
        if ( product1 == null ) {
            return null;
        }

        ProductVo productVo = new ProductVo();

        productVo.setProductId( product1.getProductId() );
        productVo.setProductName( product1.getProductName() );

        return productVo;
    }
}
