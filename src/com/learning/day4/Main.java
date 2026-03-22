package com.learning.day4;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Het");

        acc.deposit(500);
        acc.withdraw(100);
        acc.printAccountDetails();
    }
}
