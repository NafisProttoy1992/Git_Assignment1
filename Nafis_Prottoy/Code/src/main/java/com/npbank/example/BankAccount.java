package com.npbank.example;

public class BankAccount {
    private String bankAccountType;
    private int currentBalance;

    public BankAccount(String bankAccountType, int currentBalance) {
        this.bankAccountType = bankAccountType;
        this.currentBalance = currentBalance;
    }

    // GETTERS AND SETTERS

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }


    // BANK ACCOUNT METHODS



    public double depositMoney(double money){
       this.currentBalance += money;
       return currentBalance;


    }

    public double withdrawMoney(double money){
        this.currentBalance -= money;
        return currentBalance;
    }

    public void displayBankAccountInfo(){
        System.out.println("Bank Account Type: " + bankAccountType);
        System.out.println("Current Balance: $" + currentBalance);
    }

}
