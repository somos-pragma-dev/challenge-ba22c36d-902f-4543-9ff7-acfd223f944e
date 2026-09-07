package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Product;
import com.example.ecommerce.infrastructure.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        Product product1 = new Product(1L, "Product 1", 10.0, "Description 1");
        Product product2 = new Product(2L, "Product 2", 20.0, "Description 2");
        List<Product> products = Arrays.asList(product1, product2);
        when(productRepository.findAll()).thenReturn(products);
        List<Product> result = productService.getAllProducts();
        assertEquals(2, result.size());
        assertEquals(product1, result.get(0));
        assertEquals(product2, result.get(1));
    }
}