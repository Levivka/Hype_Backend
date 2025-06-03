package com.example.romich.Controllers;

import com.example.romich.Models.PreOrderProduct;
import com.example.romich.Services.PreOrderProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/pre-order-product")
public class PreOrderProductController {
    private final PreOrderProductService preOrderProductService;
    @GetMapping
    public ResponseEntity<?> listProducts() {
        return preOrderProductService.listPreOrderProducts();
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody PreOrderProduct product) {
        return preOrderProductService.createPreOrderProduct(product);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@RequestParam long id) {
        return preOrderProductService.deletePreOrderProduct(id);
    }

}
