package com.springboot.microservices.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservices.model.Product;

@Repository
public interface ProductRepository extends MongoRepository <Product, String> {

}
