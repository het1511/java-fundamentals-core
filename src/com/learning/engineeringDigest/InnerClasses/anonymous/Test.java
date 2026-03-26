package com.learning.engineeringDigest.InnerClasses.anonymous;

public class Test {
    static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150);
        CreditCard creditCard = new CreditCard();
        shoppingCart.processPayment(creditCard);

//        Ex2.
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid by anonymous");
            }
        });
    }
}
