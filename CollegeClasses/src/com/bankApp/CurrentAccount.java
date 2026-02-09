package com.bankApp;

public class CurrentAccount extends Account {
    private double overdraftLimit = 50000;

    public CurrentAccount(long accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
