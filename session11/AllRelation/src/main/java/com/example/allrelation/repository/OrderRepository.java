package com.example.allrelation.repository;

import com.example.allrelation.entity.Order;
import com.example.allrelation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
