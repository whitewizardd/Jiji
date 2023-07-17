package com.jijimoji.data.repository;

import com.jijimoji.data.models.Products;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
@ExtendWith(SpringExtension.class)
class ProductRepositoryTest {
    @Autowired
    private ProductRepository repository;
    @Test public void saveTest(){
        Products products = new Products();
        Products savedProduct = repository.save(products);
        assertEquals(1, repository.count());
        assertNotNull(savedProduct.getId());
    }
}