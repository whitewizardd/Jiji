package com.jijimoji.data.repository;

import com.jijimoji.data.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, String> {

}
