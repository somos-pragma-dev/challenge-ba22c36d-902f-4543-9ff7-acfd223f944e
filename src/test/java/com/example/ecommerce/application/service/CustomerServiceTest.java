package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Customer;
import com.example.ecommerce.infrastructure.repository.CustomerRepository;
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
public class CustomerServiceTest {
    @Mock
    private CustomerRepository customerRepository;
    @InjectMocks
    private CustomerService customerService;

    @Test
    public void testGetAllCustomers() {
        Customer customer1 = new Customer(1L, "Customer 1", "customer1@example.com");
        Customer customer2 = new Customer(2L, "Customer 2", "customer2@example.com");
        List<Customer> customers = Arrays.asList(customer1, customer2);
        when(customerRepository.findAll()).thenReturn(customers);
        List<Customer> result = customerService.getAllCustomers();
        assertEquals(2, result.size());
        assertEquals(customer1, result.get(0));
        assertEquals(customer2, result.get(1));
    }
}