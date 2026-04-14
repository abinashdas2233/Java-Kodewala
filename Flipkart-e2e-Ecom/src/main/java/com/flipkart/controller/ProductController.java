package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.flipkart.entity.ProductEntity;
import com.flipkart.request.ProductRequest;
import com.flipkart.service.IProductService;

@Controller

public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/createProduct")
    public String createProduct(@ModelAttribute ProductRequest request) {

        productService.createProduct(request);

        return "ProductSuccess";
    }

    @GetMapping("/showsearch")
    public String redirectSearchPage() {
        return "searchProduct";
    }

    @GetMapping("/search")
    public String searchProduct(
            @RequestParam("productName") String productName,
            Model model) {

        List<ProductEntity> products =
                productService.searchProductByName(productName);

        model.addAttribute("products", products);

        return "product-result";
    }
    
    @GetMapping("/navigateview")
    
    public String viewProducts(Model model) {

        List<ProductEntity> products = productService.getAllProducts();

        model.addAttribute("products", products);

        return "view-products";
    }
    @GetMapping("/createproduct")
    public String redirectProductform() {
    	return "product-form";
    }
}