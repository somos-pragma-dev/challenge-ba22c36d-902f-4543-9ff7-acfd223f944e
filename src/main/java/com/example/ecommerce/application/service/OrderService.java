package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Order;
import com.example.ecommerce.infrastructure.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    // Other CRUD operations
}