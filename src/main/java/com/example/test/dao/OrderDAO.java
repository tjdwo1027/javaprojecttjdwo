package com.example.test.dao;

import com.example.test.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {
    List<Order> findByUserId(String userId);

    List<Order> findByProductId(String productId);
}
