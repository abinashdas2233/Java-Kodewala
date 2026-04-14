package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flipkart.service.ICartService;

@Controller
public class CartController {
	@Autowired
	ICartService cartServices;
	@GetMapping("/addToCart")
	public String addToCart(
	        @RequestParam("productId") int productId,
	        @RequestParam("quantity") int quantity) {

	    cartServices.addToCart(productId, quantity);

	    return "redirect:/viewCart";
	}

	@GetMapping("/viewCart")
	public String viewCart(Model model) {

	    model.addAttribute("cartItems",
	            cartServices.getAllCartItems());

	    return "cart-items";
	}
	
	@GetMapping("/deleteCartItem")
	public String deleteCartItem(
	        @RequestParam("cartId") int cartId) {

	    cartServices.deleteCartItem(cartId);

	    return "redirect:/viewCart";
	}
	

}
