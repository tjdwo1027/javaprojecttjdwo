package com.example.test.controller;


import com.example.test.entity.Order;
import com.example.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/list")
    public List<Order> getOrderList() {
        return orderService.getOrderList();
    }

    @GetMapping("/listByUserId/{userId}")
    public List<Order> getOrderListByUserId(@PathVariable("userId") String userId) {
        return orderService.getOrderListByUserId(userId);
    }

    @GetMapping("/listByProductId/{productId}")
    public List<Order> getOrderListByProductId(@PathVariable("productId") String productId) {
        return orderService.getOrderListByProductId(productId);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }
}

