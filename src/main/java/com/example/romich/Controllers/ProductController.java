package com.example.romich.Controllers;

import com.example.romich.Models.Product;
import com.example.romich.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService<Product> productService;
    @GetMapping
    public ResponseEntity<?> listAllProducts() {
        return productService.listProducts();
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@RequestParam long id) {
        return productService.deleteProduct(id);
    }

}
