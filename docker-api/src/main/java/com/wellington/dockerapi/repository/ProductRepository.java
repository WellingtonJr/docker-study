package com.wellington.dockerapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.dockerapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    boolean existsByDescription(String description);
}
