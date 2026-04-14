package com.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{
	List<ProductEntity> findByProductNameContaining(String productName);

}
