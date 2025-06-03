package com.example.romich.Services;

import com.example.romich.Models.PreOrderProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PreOrderProductService {
     ResponseEntity<?> createPreOrderProduct(PreOrderProduct product);
     ResponseEntity<?> deletePreOrderProduct(long id);
     ResponseEntity<?> listPreOrderProducts();
}

