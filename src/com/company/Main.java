package com.company;

public class Main {

    public static void main(String[] args) {
        User u1=new User("56873","Arjun",
                "999999999","Delhi",7681.50);
        u1.Details();
        u1.showBalance();
        u1.Deposit((double) 5000);
        u1.Withdraw((double) 100000);
        u1.Withdraw(2500.15);
        u1.Details();
        u1.showBalance();

    }
}
