package com.learning.engineeringDigest.InnerClasses.anonymous;

public class CreditCard implements Payment{

    private String creditCardNumber;

    @Override
    public void pay(double amount) {
        System.out.println("Paid By Credit Card");
    }
}
