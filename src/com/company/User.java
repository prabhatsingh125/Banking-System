package com.company;

public class User {
    String accountNumber;
    String userName;
    String mobileNo;
    String address;
    Double balance;

    public User(String accountNumber, String userName, String mobileNo, String address, Double balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.mobileNo = mobileNo;
        this.address = address;
        this.balance = balance;
    }
    void Deposit(Double bal)
    {
        balance+=bal;
        System.out.println("Your account balance after deposition is : "+ balance);
    }
    void Withdraw(Double bal2)
    {
        if(bal2>balance)
        {
            System.out.println("Insufficient balance of your required withdraw");
        }
        else {
            balance-=bal2;
            System.out.println("Your account balance after withdraw is : "+balance);
        }
    }

    void showBalance()
    {
        System.out.println("Your account balance is : "+ balance);

    }
    void Details()
    {
        System.out.println( userName+" Account Number is "+accountNumber
        +" Mobile no is "+mobileNo+" having address "+address+" with account balance "+balance);

    }

}
