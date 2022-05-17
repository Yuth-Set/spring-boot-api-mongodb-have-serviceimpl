package com.springboot.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservices.model.Product;
import com.springboot.microservices.model.service.ServiceImplement;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	@Autowired
	private ServiceImplement serviceImplent;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> finalAll() {
		
		return serviceImplent.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product) {
		
		serviceImplent.createProduct(product);
		
	}
	
	
	
	
	
	
	

}
