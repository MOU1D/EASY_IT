package com.example.EASY_IT.repository;

import com.example.EASY_IT.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}