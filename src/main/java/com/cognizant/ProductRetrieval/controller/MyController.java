package com.cognizant.ProductRetrieval.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cognizant.ProductRetrieval.models.ListOfProducts;
import com.cognizant.ProductRetrieval.models.Product;

@RestController
public class MyController {
	RestTemplate restTemplate = new RestTemplate();
	
//	@Autowired
	private ListOfProducts listedProducts;
	
	@RequestMapping("/products")
	public ArrayList<Product> myProd() {
		return listedProducts.getListOfProducts();
	}
	
}
