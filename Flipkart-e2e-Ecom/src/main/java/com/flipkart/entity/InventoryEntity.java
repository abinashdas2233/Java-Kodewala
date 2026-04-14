package com.flipkart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventoryId;

    private int productId;

    private int availableQty;

    private String status;

    public InventoryEntity() {
    }

    public InventoryEntity(int inventoryId, int productId, int availableQty, String status) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.availableQty = availableQty;
        this.status = status;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}