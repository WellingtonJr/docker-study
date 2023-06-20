package com.wellington.dockerapi.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ProductDto {

    private String description;

    private Double price;

    private Integer quantity;

    private LocalDate expirationDate;
}
