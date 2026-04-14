package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.flipkart.repository.InventoryRepo;

public class InventoryServiceImplementation implements IInventoryService{
	@Autowired
	InventoryRepo reepo;
	

	@Override
	public int findByProductId(int id) {
		// TODO Auto-generated method stub
		
		return reepo.findById(id).get().getInventoryId();
	}

}
