package com.example.romich.Services;

import com.example.romich.Models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
     ResponseEntity<?> createProduct(Product product);
     ResponseEntity<?> deleteProduct(long id);
     ResponseEntity<?> listProducts();
}
