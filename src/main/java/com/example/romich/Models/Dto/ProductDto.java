package com.example.romich.Models.Dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
    private String name;
    private double price;
    private List<Short> sizes;
    private String type;
    private String material;
    private String backgroundMainColor;
    private String backgroundSubColor;
    private String mainColor;
    private String subColor;
    private String mainImageURL;
    private String subImageURL;
}
