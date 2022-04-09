package com.company;

public class Main {

    public static void main(String[] args) {
BankAccount bankAccount = new BankAccount();

       bankAccount.setAccountNumber(10);
       bankAccount.setBalance(0);
       bankAccount.setCustomerName("Saugat");
       bankAccount.setEmail("baralsaugat@gmail.com");
       bankAccount.setPhoneNumber("9849184885");

        System.out.println("Customer name: "+ bankAccount.getCustomerName());
        System.out.println("Acc. number: "+ bankAccount.getAccountNumber());
        System.out.println("Initial Balance: "+ bankAccount.getBalance());
        System.out.println("Email:"+ bankAccount.getEmail());
        System.out.println("New Balance: "+ bankAccount.depositFunds(1000));
        System.out.println("After Withdrawal: "+ bankAccount.withdrawFunds(200));
        System.out.println("After Withdrawal: "+ bankAccount.withdrawFunds(1000));
    }
}
