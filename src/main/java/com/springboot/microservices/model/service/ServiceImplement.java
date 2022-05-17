package com.springboot.microservices.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.springboot.microservices.model.Product;
import com.springboot.microservices.repository.ProductRepository;

@Service
public class ServiceImplement {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		
		return productRepository.findAll();
		
	}
	
	public void createProduct(@RequestBody Product product) {
		
		productRepository.save(product);
		
	}
}
