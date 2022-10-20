package com.example.demo.model;

public class ProductVo {
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
public ProductVo(int productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}
public ProductVo() {
	super();
	// TODO Auto-generated constructor stub
}


}
