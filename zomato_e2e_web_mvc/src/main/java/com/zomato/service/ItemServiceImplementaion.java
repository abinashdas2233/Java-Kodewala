package com.zomato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zomato.DAO.ItemRepo;
import com.zomato.DTO.ItemRequest;
import com.zomato.entity.ItemsEntity;
@Service
public class ItemServiceImplementaion implements IitemsServices{
	@Autowired
	ItemRepo repo;

	@Override
	@Transactional
	public String createItems(ItemRequest items) {
		// TODO Auto-generated method stub
		
		
		ItemsEntity food=new ItemsEntity();
		food.setItemName(items.getItemName());
		food.setDescription(items.getDescription());
		food.setPrice(items.getPrice());
		food.setQuantity(items.getQuantity());
		
		repo.saveOrder(food);
		return "done";
	}

	@Override
	@Transactional
	public List<ItemsEntity> fetchData() {
		// TODO Auto-generated method stub
		return repo.fetchData();
	}

	@Override
	@Transactional
	public ItemsEntity getById(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	@Transactional
	public void updateItem(ItemsEntity item) {
		// TODO Auto-generated method stub
		repo.updateProduct(item);;
	}

}
