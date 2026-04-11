package com.zomato.service;

import java.util.List;

import com.zomato.DTO.ItemRequest;
import com.zomato.entity.ItemsEntity;

public interface IitemsServices {
	public String createItems(ItemRequest items);
	public List<ItemsEntity>fetchData();
	public ItemsEntity getById(int id);
	public void updateItem(ItemsEntity item);

}
