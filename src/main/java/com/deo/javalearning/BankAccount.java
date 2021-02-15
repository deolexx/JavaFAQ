package com.deo.javalearning;

import lombok.Getter;



public class BankAccount {
    String firstName;
    String lastName;
    @Getter
    double balance;


    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }


    public double deposit(double amount, boolean branch) {
        balance+=amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch) {
        balance-=amount;
        return  balance;
    }


}
