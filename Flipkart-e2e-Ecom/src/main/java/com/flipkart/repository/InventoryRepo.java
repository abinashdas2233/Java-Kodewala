package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.InventoryEntity;

public interface InventoryRepo extends JpaRepository<InventoryEntity, Integer>{
	InventoryEntity findByProductId(int productId);

}
