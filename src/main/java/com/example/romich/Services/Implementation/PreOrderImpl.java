package com.example.romich.Services.Implementation;

import com.example.romich.Models.PreOrderProduct;
import com.example.romich.Models.Product;
import com.example.romich.Repositories.PreOrderProductRepository;
import com.example.romich.Repositories.ProductRepository;
import com.example.romich.Services.PreOrderProductService;
import com.example.romich.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PreOrderImpl implements PreOrderProductService {
    private final PreOrderProductRepository productRepository;

    @Override
    public ResponseEntity<?> createPreOrderProduct(PreOrderProduct product) {
        if(productRepository.findById(product.getId()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Pre-order product already exists");
        }
        System.out.println(product);
        productRepository.save(product);
        if (productRepository.findById(product.getId()).isPresent()) {
            return ResponseEntity.ok(product);
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        }
    }

    @Override
    public ResponseEntity<?> deletePreOrderProduct(long id) {
        if (productRepository.findById(id) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No pre-order product found with id " + id);
        }
        else {
            return ResponseEntity.ok(productRepository.deleteById(id));
        }
    }

    @Override
    public ResponseEntity<?> listPreOrderProducts() {
        List<PreOrderProduct> products = productRepository.findAll();
        if (products.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No products found");
        }
        else {
            return ResponseEntity.ok(products);
        }
    }
}
