package com.example.romich.Models;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private long id;
    private String name;
    private double price;
    private List<Short> sizes;
    private String type;
}
