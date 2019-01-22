package com.cognizant.ProductRetrieval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.cognizant.ProductRetrieval.service")
public class ProductRetrievalApplication {

	public static void main(String args[]) {
		SpringApplication.run(ProductRetrievalApplication.class);
	}

}

