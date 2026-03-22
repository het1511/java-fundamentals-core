package com.learning.day4;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Het");

        try {
            acc.deposit(-50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            acc.withdraw(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
