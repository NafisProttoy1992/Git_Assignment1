package com.npbank.example;

public class BankEmployee extends BankUser{
    private String employeeId;
    private String employeeLevel;
    private String dateHired;

    public BankEmployee(String bankUserId, String firstName, String lastName, String dateInitiated, String socialSecurityNo, String email, String userName, String password,String typeOfRole, String employeeId, String employeeLevel, String dateHired) {
        super(bankUserId, firstName, lastName, dateInitiated, socialSecurityNo, email, userName, password, typeOfRole);

        this.employeeId = employeeId;
        this.employeeLevel = employeeLevel;
        this.dateHired = dateHired;

    }


    // GETTERS AND SETTERS

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    // BANK EMPLOYEE METHODS

    public void displayEmployeeInfo(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + getFirstName() + " " + getLastName());
        System.out.println("Employee Level: " + getEmployeeLevel());
    }
}
