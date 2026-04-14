package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.CartEntity;
import com.flipkart.entity.InventoryEntity;
import com.flipkart.entity.ProductEntity;
import com.flipkart.repository.CartRepo;
import com.flipkart.repository.InventoryRepo;
import com.flipkart.repository.ProductRepo;

@Service
public class PaymentServiceImplementation implements IPaymentService {

    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private InventoryRepo inventoryRepo;
    @Autowired
    ProductRepo prep;

    @Override
    public void paymentUpdate() {

        List<CartEntity> cartItems = cartRepo.findAll();

        for (CartEntity item : cartItems) {

            InventoryEntity inventory =
                    inventoryRepo.findByProductId(
                            item.getProductId());

            if (inventory != null) {

                int availableQty =
                        inventory.getAvailableQty();

                int cartQty =
                        item.getQuantity();

                if (availableQty >= cartQty) {

                    inventory.setAvailableQty(
                            availableQty - cartQty
                    );

                    inventoryRepo.save(inventory);
                    ProductEntity pro=prep.findById(item.getProductId()).get();
                    pro.setQuantity(availableQty - cartQty);
                    prep.save(pro);
                }
            }
        }

        cartRepo.deleteAll();
    }
}