package com.example.test.service;

import com.example.test.entity.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    List<Order> getOrderList();

    List<Order> getOrderListByUserId(String userId);

    List<Order> getOrderListByProductId(String productId);

    Order getOrderById(Long id);
}
