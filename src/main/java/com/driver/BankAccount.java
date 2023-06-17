package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public BankAccount(String name, double balance, double minBalance) {
            this.name=name;
            this.balance = balance;
            this.minBalance = minBalance;
    }
    int sumofdigit = 0;
    public void isPossible(int digit){
        if(digit==0) return;

        sumofdigit += digit%10;

        isPossible(digit/10);
    }
    public String generateAccountNumber(int digits, int sum) throws Exception{
       isPossible(digits);

       if(sumofdigit != sum){
           throw new Exception("Account Number can not be generated");
       }

        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        return null;
    }

    public void deposit(double amount) {
        this.balance += amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(this.minBalance < amount){
            throw new Exception("Insufficient Balance");
        }

        this.balance -= amount;
    }

}