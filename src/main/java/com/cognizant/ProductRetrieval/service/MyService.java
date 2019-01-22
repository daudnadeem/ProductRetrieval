package com.cognizant.ProductRetrieval.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cognizant.ProductRetrieval.ProductRetrievalApplication;
import com.cognizant.ProductRetrieval.models.ListOfProducts;
import com.cognizant.ProductRetrieval.models.Product;

@Component
public class MyService implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(ProductRetrievalApplication.class);
	static ListOfProducts myList = new ListOfProducts();
	
	public static void callRestService() {
	RestTemplate restTemplate = new RestTemplate();
	String products = restTemplate.getForObject(
			"https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma", String.class);
	
	log.info(products);
	;
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();
	}

	}

