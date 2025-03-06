package com.example.romich.Services;

import com.example.romich.Models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductService<T extends Product> {
    public ResponseEntity<?> createProduct(T product);
    public ResponseEntity<?> deleteProduct(long id);
    public ResponseEntity<?> listProducts();
}
