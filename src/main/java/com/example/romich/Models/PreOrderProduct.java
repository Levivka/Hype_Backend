package com.example.romich.Models;

import com.example.romich.Models.Dto.ProductDto;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Inherited;

@Document(collection = "preOrderProduct")
@Data
public class PreOrderProduct {
    private final String id;
    private ProductDto product;
    private int currentAmmount;
    private int maxAmmount;
}
