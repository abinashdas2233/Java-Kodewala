package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flipkart.entity.CartEntity;

public interface CartRepo extends JpaRepository<CartEntity, Integer> {
}