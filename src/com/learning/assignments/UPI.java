package com.learning.assignments;

public class UPI implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}
