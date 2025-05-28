package com.example.romich.Controllers;

import com.example.romich.Models.PreOrderProduct;
import com.example.romich.Models.Product;
import com.example.romich.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/pre-order-product")
public class PreOrderProductController {
    private final ProductService<PreOrderProduct> productService;
    @GetMapping
    public ResponseEntity<?> listProducts() {
        return productService.listProducts();
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody PreOrderProduct product) {
        return productService.createProduct(product);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@RequestParam long id) {
        return productService.deleteProduct(id);
    }

}
