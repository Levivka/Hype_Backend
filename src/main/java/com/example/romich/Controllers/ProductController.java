package com.example.romich.Controllers;

import com.example.romich.Models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductController {

    public ResponseEntity<String> createProduct(Product product) {

    }

}
