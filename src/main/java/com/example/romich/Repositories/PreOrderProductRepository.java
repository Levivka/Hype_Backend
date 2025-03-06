package com.example.romich.Repositories;

import com.example.romich.Models.PreOrderProduct;
import com.example.romich.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PreOrderProductRepository extends MongoRepository<PreOrderProduct, String> {
    Product findById(long id);
    String deleteById(long id);
}
