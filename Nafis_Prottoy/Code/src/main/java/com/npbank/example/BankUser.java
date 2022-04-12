package com.npbank.example;

public class BankUser {
    private String bankUserId;
    private String firstName;
    private String lastName;
    private String dateInitiated;
    private String socialSecurityNo;
    private String email;
    private String userName;
    private String password;
    private String typeOfRole;   //Employee or customer


    // CONSTRUCTOR

    public BankUser(String bankUserId, String firstName, String lastName, String dateInitiated, String socialSecurityNo, String email, String userName, String password, String typeOfRole) {
        this.bankUserId = bankUserId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateInitiated = dateInitiated;
        this.socialSecurityNo = socialSecurityNo;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.typeOfRole = typeOfRole;
    }

    // GETTERS AND SETTERS

    public String getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(String bankUseId) {
        this.bankUserId = bankUserId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateInitiated() {
        return dateInitiated;
    }

    public void setDateInitiated(String dateInitiated) {
        this.dateInitiated = dateInitiated;
    }

    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeOfRole() {
        return typeOfRole;
    }

    public void setTypeOfRole(String typeOfRole) {
        this.typeOfRole = typeOfRole;
    }
    // CLASS METHODS

    public void logIn(String username, String password ){


        if(this.userName.equals("Nafis") && this.password.equals("pass")){
            System.out.println(" Welcome " + userName + ", you have succesfully logged in to your account.");
        }else{
            System.out.println("Log in unsuccessful, you have provided incorrect credentials");
        }

    }

    public void logOut(){
        System.out.println(userName + ", you have successfully logged out of your account.");
    }

    public void displayBankUserInfo(){
        System.out.println("Bank User ID: " + bankUserId);
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Date of record: " + dateInitiated);
        System.out.println("Social Security Number: " + socialSecurityNo);
        System.out.println("Email: " + email);
    }
}
