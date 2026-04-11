package com.zomato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.zomato.DTO.ItemRequest;
import com.zomato.entity.ItemsEntity;
import com.zomato.service.IitemsServices;

@Controller
public class ItemController {
	@Autowired
	IitemsServices services;
	
	
	@PostMapping("/submitItem")
	public String createItem(@ModelAttribute ItemRequest items) {
		System.out.println(items.toString());
		services.createItems(items);
		return "itemSuccess";
	}
	@GetMapping("/fetchItem")
	public String fetchingItem(Model model) {
	    
	    List<ItemsEntity> list = services.fetchData();

	    model.addAttribute("items", list); // sending data to JSP

	    return "itemList";
	}
	@GetMapping("/editItem/{id}")
	public String editItem(@PathVariable("id") int id, Model model) {
	    
	    ItemsEntity item = services.getById(id);
	    
	    model.addAttribute("item", item);
	    
	    return "updateItem"; 
	}
	@PostMapping("/updateItems")
	public String updateItem(@ModelAttribute ItemsEntity item) {
	    
	    services.updateItem(item);
	    
	    return "redirect:/fetchItem";
	}

}
