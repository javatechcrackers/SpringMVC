package com.org.pkk.model;

public class Product {

	int productId;
	String productName;
	String flavour;
	int price;
	
	
	
	
	public Product(int productId, String productName, String flavour, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.flavour = flavour;
		this.price = price;
	}
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
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
