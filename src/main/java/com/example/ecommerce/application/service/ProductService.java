package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Product;
import com.example.ecommerce.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    // Other CRUD operations
}