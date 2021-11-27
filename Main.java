package com.company;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    //State
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Bank b1 = new Bank();



        b1.AddCustomer("Yakub", 1981);
        b1.AddCustomer("Hamood", 1996);
        b1.AddCustomer("Dahoud", 1975);
        b1.AddCustomer("Walid", 2012);
        b1.AddCustomer("Mahmoud", 2015);

        b1.AddAccount(1996);
        b1.AddAccount(1996);
        b1.AddAccount(2012);
        b1.AddAccount(2012);

        b1.RemoveCustomer(2015);
        System.out.println(b1.RemoveCustomer(2015));



        System.out.println(b1.ShowCustomerAccountsInfo(1996));
        System.out.println(b1.ShowCustomerAccountsInfo(2012));




    }

}

