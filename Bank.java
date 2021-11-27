package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank {
    //State
    private long balance;
    private String name;
    private String account;
    private String pnr;

    private String Bankname;
    public List<Customer> Customers;


    //Constructor
    Scanner sc = new Scanner(System.in);

    public Bank(String bankname) {
        Bankname = bankname;
    }

    public Bank() {
        Bankname = "";
        Customers = new ArrayList<>();
    }

    public Bank(String bankname, List<Customer> customers) {
        Bankname = bankname;
        Customers = customers;
    }

    public List<String> ShowCustomerAccountsInfo(int pnr) {
        List<String> temp = new ArrayList<>();
        for (var cust : Customers) {
            if (cust.pnr == pnr) {
                temp.addAll(cust.showAccountsInfo());
            }
        }
        return temp;
    }

    public void AddCustomer(String name, int pnr) {
        Customer c = new Customer(name, pnr);
        Customers.add(c);
    }

    public void AddAccount(int pnr) {
        for (var cust : Customers) {
            if (cust.pnr == pnr) {
                cust.AddAccount();
            }
        }
    }

    public boolean RemoveCustomer(int pnr) {
        int index = 0;
        for (var cust : Customers) {
            if (cust.pnr == pnr) {
                index = Customers.indexOf(cust);
            }
        }
        Customers.remove(index);
        return false;
    }


}
