package com.flipkart.service;

import java.util.List;

import com.flipkart.entity.ProductEntity;
import com.flipkart.request.ProductRequest;

public interface IProductService {
	public void createProduct(ProductRequest product);
	List<ProductEntity> searchProductByName(String productName);
	List<ProductEntity>getAllProducts();
	

}
