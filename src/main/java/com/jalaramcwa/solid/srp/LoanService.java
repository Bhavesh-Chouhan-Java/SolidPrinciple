package com.jalaramcwa.solid.srp;

public class LoanService {

    public int getLoanInterest(String loanType){
        int interest = 10;
        if(loanType.equals("HomeLoan")){
            interest = 8;
        }else if(loanType.equals("PersonalLoan")){
            interest = 10;
        }else if(loanType.equals("CarLoan")){
            interest = 7;
        }
        return interest;
    }

}
