package com.wellington.dockerapi.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.wellington.dockerapi.dto.ProductDto;
import com.wellington.dockerapi.model.Product;

public interface ProductService {

    Product save(Product product);

    Optional<Product> findById(UUID id);

    List<Product> findAll();

    Product update(ProductDto dto, Product product);

    void delete(Product product);

    boolean existsByDescription(String description);

}
