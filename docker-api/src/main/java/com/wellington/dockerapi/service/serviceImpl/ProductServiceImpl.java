package com.wellington.dockerapi.service.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.dockerapi.dto.ProductDto;
import com.wellington.dockerapi.model.Product;
import com.wellington.dockerapi.repository.ProductRepository;
import com.wellington.dockerapi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(UUID id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product update(ProductDto dto, Product product) {
        BeanUtils.copyProperties(dto, product);
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public boolean existsByDescription(String description) {
        return productRepository.existsByDescription(description);
    }

}
