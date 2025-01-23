package com.modelClass;
//Ex4
public class BankAccount {
    String accountHolderName;
    Double balance;
    public BankAccount(String accountHolderName,Double balance)//constructor
    {
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void deposit(double depositAmount)
    {
        if(depositAmount>0)
            balance= balance+depositAmount;
    }
    public boolean withdrawSuccessful(double withdrawAmount)
    {
        if(withdrawAmount>balance)
        {
            return false;
        }
        balance = balance-withdrawAmount;
        return true;
    }
    public double getBalance()
    {
        return balance;
    }
}
