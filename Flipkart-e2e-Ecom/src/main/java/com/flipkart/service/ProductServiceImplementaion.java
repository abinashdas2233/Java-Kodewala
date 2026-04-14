package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.InventoryEntity;
import com.flipkart.entity.ProductEntity;
import com.flipkart.repository.InventoryRepo;
import com.flipkart.repository.ProductRepo;
import com.flipkart.request.ProductRequest;

@Service
public class ProductServiceImplementaion implements IProductService {

    @Autowired
    ProductRepo productrepo;

    @Autowired
    InventoryRepo inventoryRepo;

    @Override
    public void createProduct(ProductRequest product) {

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductName(product.getProductName());
        productEntity.setPrice(product.getPrice());
        productEntity.setDescription(product.getDescription());
        productEntity.setQuantity(product.getQuantity());
        productEntity.setStatus(product.getStatus());

        
        ProductEntity savedProduct = productrepo.save(productEntity);

        
        InventoryEntity inventory = new InventoryEntity();

        inventory.setProductId(savedProduct.getProductId());
        inventory.setAvailableQty(product.getQuantity());
        inventory.setStatus(product.getStatus());

        
        inventoryRepo.save(inventory);
    }

	@Override
	public List<ProductEntity> searchProductByName(String productName) {
		// TODO Auto-generated method stub
		return productrepo.findByProductNameContaining(productName);
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}
}