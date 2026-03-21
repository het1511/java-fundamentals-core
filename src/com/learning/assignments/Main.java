package com.learning.assignments;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay(500);
        p2.pay(200);
    }
}
