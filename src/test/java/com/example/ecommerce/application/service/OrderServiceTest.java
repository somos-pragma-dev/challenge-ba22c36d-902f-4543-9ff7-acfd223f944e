package com.example.ecommerce.application.service;

import com.example.ecommerce.domain.model.Order;
import com.example.ecommerce.infrastructure.repository.OrderRepository;
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
public class OrderServiceTest {
    @Mock
    private OrderRepository orderRepository;
    @InjectMocks
    private OrderService orderService;

    @Test
    public void testGetAllOrders() {
        Order order1 = new Order(1L, null);
        Order order2 = new Order(2L, null);
        List<Order> orders = Arrays.asList(order1, order2);
        when(orderRepository.findAll()).thenReturn(orders);
        List<Order> result = orderService.getAllOrders();
        assertEquals(2, result.size());
        assertEquals(order1, result.get(0));
        assertEquals(order2, result.get(1));
    }
}