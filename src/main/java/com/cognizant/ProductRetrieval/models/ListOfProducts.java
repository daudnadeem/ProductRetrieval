package com.cognizant.ProductRetrieval.models;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;


public class ListOfProducts {
	
	ArrayList<Product> listOfProducts = new ArrayList<Product >();
	
	@Bean
	public ArrayList<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(ArrayList<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

}
