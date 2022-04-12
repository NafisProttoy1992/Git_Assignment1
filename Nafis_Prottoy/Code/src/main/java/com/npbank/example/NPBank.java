package com.npbank.example;

import java.util.Scanner;

public class NPBank {
    public static void main (String[] args){

        // BANK CUSTOMER OBJECT

//        Scanner scanner = new Scanner(System.in);
       

        BankCustomer myNewAccount = new BankCustomer("A1225", "Nafis", "Prottoy", "01/01/2019", "111-20-1112", "nafis@gmail.com", "Nafis123","password", "Customer", "C00001", "Checking", "01/01/2022");
        myNewAccount.displayCustomerInfo();

        // EMPLOYEE OBJECT

        BankEmployee newEmployeeJosh = new BankEmployee("E1123", "Josh", "Thompson", "01/02/2021", "123-12-1234", "josh@NPBank.com", "joshthompson123", "jt123", "Employee", "E1234", "CustomerService", "01/05/2021");
        newEmployeeJosh.displayEmployeeInfo();

        //BANK ACCOUNT OBJECT

        BankAccount mySavingsAccount = new BankAccount("Savings", 5000);
        mySavingsAccount.displayBankAccountInfo();
        // deposit money method
        mySavingsAccount.depositMoney(500.00);
        mySavingsAccount.displayBankAccountInfo();
        //withdraw money
        mySavingsAccount.withdrawMoney(200.00);
        mySavingsAccount.displayBankAccountInfo();









    }

}
