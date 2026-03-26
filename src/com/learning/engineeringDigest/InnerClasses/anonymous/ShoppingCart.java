package com.learning.engineeringDigest.InnerClasses.anonymous;

public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentmethod) {
        paymentmethod.pay(totalAmount);
    }
}
