package com.example.romich.Services.Implementation;

import com.example.romich.Models.Product;
import com.example.romich.Repositories.ProductRepository;
import com.example.romich.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<?> createProduct(Product product) {
        if (productRepository.findById(product.getId()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product already exists");
        }
        productRepository.save(product);
        if (productRepository.findById(product.getId()) != null) {
            return ResponseEntity.ok(product);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }

    @Override
    public ResponseEntity<?> deleteProduct(long id) {
        if (productRepository.findById(id) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No product found with id " + id);
        }
        else {
            return ResponseEntity.ok(productRepository.deleteById(id));
        }
    }

    @Override
    public ResponseEntity<?> listProducts() {
        List<Product> products = productRepository.findAll();
        if (products.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No products found");
        }
        else {
            return ResponseEntity.ok(products);
        }
    }
}
