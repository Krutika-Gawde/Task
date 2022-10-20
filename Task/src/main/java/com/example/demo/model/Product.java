package com.example.demo.model;

public class Product {
private int productId;
private String productName;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Product(int productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}


}
