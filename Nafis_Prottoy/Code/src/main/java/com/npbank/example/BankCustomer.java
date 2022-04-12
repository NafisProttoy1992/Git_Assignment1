package com.npbank.example;

import java.util.jar.JarOutputStream;

public class BankCustomer extends BankUser{
    private String customerId;
    private String accountType;
    private String dateAccountOpened;




    //CONSTRUCTOR

    public BankCustomer(String bankUserId, String firstName, String lastName, String dateInitiated, String socialSecurityNo, String email, String userName, String password, String typeOfRole, String customerId, String accountType, String dateAccountOpened) {
        super(bankUserId, firstName, lastName, dateInitiated, socialSecurityNo, email, userName, password, typeOfRole);

        this.customerId = customerId;
        this.accountType = accountType;
        this.dateAccountOpened = dateAccountOpened;
    }


    // GETTERS AND SETTERS

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    //BANK CUSTOMER METHODS


    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + customerId);
        System.out.println("Account Type:" + accountType);
        System.out.println("Date Account Opened: " + dateAccountOpened);
    }

    @Override
    public void displayBankUserInfo() {
        super.displayBankUserInfo();
        displayCustomerInfo();
    }
}
