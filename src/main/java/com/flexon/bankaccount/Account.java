package com.flexon.bankaccount;

import java.util.Date;

public class Account {
    private String AccountNumber;
    private Double Balance;
    private String CustomerName;
    private String EmailAddress;
    private String PhoneNumber;

    Account(Double Balance, String CustomerName, String EmailAddress, String PhoneNumber) {
        this.AccountNumber = String.valueOf(new Date().getTime());
        this.Balance = Balance;
        this.CustomerName = CustomerName;
        this.EmailAddress = EmailAddress;
        this.PhoneNumber = PhoneNumber;
    }

    public String getAccountNumber() {
        return this.AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public Double getBalance() {
        return this.Balance;
    }

    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }

    public String getCustomerName() {
        return this.CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getEmailAddress() {
        return this.EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
}