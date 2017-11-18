package com.org.pkk.service;

import java.util.ArrayList;

import org.slf4j.Logger;

import com.org.pkk.model.Product;

public class ProductService {
	
	//Logger log = new ProductService();
	
	Product product =null;
	ArrayList<Product> list = new ArrayList<Product>();
	
	public ProductService(){
		
		list.add(product = new Product(1, "Vannila", "Vannila", 333));
		list.add(product = new Product(1, "Chocolate", "Chocolate", 333));
		list.add(product = new Product(1, "apple", "Vannila", 333));
		
		
	}
	
	public ArrayList<Product> getAllProduct(){
		return list;
		
	}
	
	public Product getone()
	{
		return new Product(1, "Chocolate", "Chocolate", 333);
		
	}
	
}
