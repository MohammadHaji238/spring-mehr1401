package com.example.allrelation.repository;

import com.example.allrelation.entity.Category;
import com.example.allrelation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
