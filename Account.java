package com.company;


import java.util.Scanner;

public class Account {
    //State
    private int balance;
    private int accountNumber;
    private String accounttype;

    Scanner sc = new Scanner(System.in);

    public Account() {
        accounttype = "Debit";
        balance = 0;
    }


    public void createAccountNr(int accountNr) {
        this.accountNumber = accountNr;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }



        //method to deposit money
    public void deposit(){
        long amt;
        amt = sc.nextLong();
        balance = (int) (balance + amt);
    }

    //method to withdraw money
    public boolean withdraw(int amount) {
        if (amount >= balance) {
            balance = balance - amount;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}





