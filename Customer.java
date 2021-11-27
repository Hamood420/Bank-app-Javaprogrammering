package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    //State
    private String name;
    int pnr;
    private List<Account> Accounts;

    public Customer(String name, int pnr) {
        this.name = name;
        this.pnr = pnr;
        Accounts = new ArrayList<>();
    }

    public void AddAccount() {
        Account account = new Account();

        int nextAccountNr = 1000;
        for (Account value : Accounts) {

            if (nextAccountNr < value.getAccountNumber()) {
                nextAccountNr = value.getAccountNumber();
            }
        }
        nextAccountNr += 1;
        account.createAccountNr(nextAccountNr);

        Accounts.add(account);
    }

    public int RemoveAccount(int accountNumber) {

        for (var acc : Accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                Accounts.indexOf(accountNumber);
                Accounts.remove(acc);
            }
        }
        Accounts.remove(accountNumber);

        return RemoveAccount(accountNumber);
    }


    //method to display account details
    public List<String> showAccountsInfo() {
        List<String> info = new ArrayList<>();
        for (var acc : Accounts) {
            info.add(acc.toString());
        }

        return info;
    }

    //method to search an account number
    public boolean search(String accountnumber) {
        if (accountnumber.equals(accountnumber)) {
            return (true);
        }
        return (false);
    }

}



