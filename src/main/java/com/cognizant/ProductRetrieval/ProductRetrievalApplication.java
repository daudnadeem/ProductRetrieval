package com.cognizant.ProductRetrieval;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cognizant.ProductRetrieval.models.Product;

@SpringBootApplication
public class ProductRetrievalApplication {

	private static final Logger log = LoggerFactory.getLogger(ProductRetrievalApplication.class);

	public static void main(String args[]) {
		SpringApplication.run(ProductRetrievalApplication.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Product products = restTemplate.getForObject(
					"https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma", Product.class);
			log.info(products.toString());
		};
	}

}

