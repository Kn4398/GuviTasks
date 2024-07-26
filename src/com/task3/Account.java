package com.task3;

public class Account {
    private String accountNumber;
    private double balance;

    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountNumber("123456789001");
        System.out.println("Account 1 number: " + account1.getAccountNumber());
        System.out.println("Account 1 initial balance: " + account1.checkBalance());
        account1.deposit(5000);
        System.out.println("Account 1 balance after Deposit: " + account1.checkBalance());
        account1.withdraw(1000);
        System.out.println("Account 1 final balance: " + account1.checkBalance());

        Account account2 = new Account("123456789002", 10000);
        System.out.println("Account 2 number: " + account2.getAccountNumber());
        System.out.println("Account 2 initial balance: " + account2.checkBalance());
        account2.deposit(2000);
        System.out.println("Account 2 balance after Deposit: " + account2.checkBalance());
        account2.withdraw(3000);
        System.out.println("Account 2 final balance: " + account2.checkBalance());
    }
}
