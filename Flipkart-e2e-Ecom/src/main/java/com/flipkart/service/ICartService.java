package com.flipkart.service;

import java.util.List;

import com.flipkart.entity.CartEntity;

public interface ICartService {
	public void addToCart(int productId,int qty);
	public List<CartEntity>getAllCartItems();
	public void deleteCartItem(int cartId);

}
