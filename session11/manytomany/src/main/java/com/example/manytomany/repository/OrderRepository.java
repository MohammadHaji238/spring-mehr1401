package com.example.manytomany.repository;

import com.example.manytomany.entity.Order;
import com.example.manytomany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
