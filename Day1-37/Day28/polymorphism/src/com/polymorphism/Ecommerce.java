package com.polymorphism;

class FoodDelivery { }

class DeliveryPartner extends FoodDelivery {
    public void trackingSystem() {
        System.out.println("location tracking");
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        FoodDelivery obj = new DeliveryPartner(); // Upcasting

        if (obj instanceof DeliveryPartner) {
            DeliveryPartner dp = (DeliveryPartner) obj; //  downcasting
            dp.trackingSystem();
        }
    }
}
