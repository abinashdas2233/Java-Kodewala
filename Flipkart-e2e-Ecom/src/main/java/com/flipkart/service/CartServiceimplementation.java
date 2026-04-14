package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.CartEntity;
import com.flipkart.entity.ProductEntity;
import com.flipkart.repository.CartRepo;
import com.flipkart.repository.ProductRepo;
@Service
public class CartServiceimplementation  implements ICartService{
	@Autowired
	CartRepo cartRepo;
	@Autowired
	ProductRepo prepo;

	@Override
	public void addToCart(int productId,int qty) {
		// TODO Auto-generated method stub
		
		ProductEntity product = prepo.findById(productId).orElse(null);

	    if (product != null) {
	        CartEntity cart = new CartEntity();

	        cart.setProductId(product.getProductId());
	        cart.setProductName(product.getProductName());
	        cart.setPrice(product.getPrice());
	        cart.setQuantity(qty);

	        cartRepo.save(cart);
	    }
	}

	@Override
	public List<CartEntity> getAllCartItems() {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

	@Override
	public void deleteCartItem(int cartId) {
		cartRepo.deleteById(cartId);
		
	}

}
