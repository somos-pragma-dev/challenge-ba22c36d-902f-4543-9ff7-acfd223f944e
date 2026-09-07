package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Customer;
import com.example.ecommerce.infrastructure.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    // Other CRUD operations
}