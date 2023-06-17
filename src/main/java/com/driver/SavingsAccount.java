package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name,balance,0);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;

    }
    public void withdraw(double amount) throws Exception {

        if(amount > this.maxWithdrawalLimit){
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        else if(this.getBalance() <amount){
            throw new Exception("Insufficient Balance");
        }
        else{
            double curr = this.getBalance();

            curr -= amount;
            this.setBalance(curr);

        }


        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double interest = (this.getBalance() * this.rate * years)/100;

        return interest;

    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double interest = this.getBalance() * (Math.pow((years + this.rate / 100), times)) - this.getBalance();

        return interest;
    }

}
