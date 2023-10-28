package com.jalaramcwa.solid.dip;

public class CreditCard implements BankCard{

    @Override
    public void doTransaction(long amount){
        System.out.println("Payment Using CreditCard");
    }
}
