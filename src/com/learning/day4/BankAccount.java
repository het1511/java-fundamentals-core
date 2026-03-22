package com.learning.day4;

public class BankAccount {
    private String accountHolder;
    private double balance;
//Balance is private to protect data integrity and prevent direct modification from outside the class.

//We don’t provide a setter because balance should only be modified through
//controlled methods like deposit and withdraw, which include validation.
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (!(amount < 0)) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            throw new InvalidAmountException("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        float withdrawalFee = 2.0F;

        if (!(amount < 0)) {
            if (balance > 0) {
                balance -= amount + withdrawalFee;
                System.out.println("Withdrawn: " + amount + " (Fee: " + withdrawalFee + ")");
            } else {
                throw new InsufficientBalanceException("Insufficient balance");
            }
        } else {
            throw new InvalidAmountException("Invalid withdrawal amount");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
