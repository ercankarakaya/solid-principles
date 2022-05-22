package com.ercan.SingleResponsibility.example3;

public class Account {
    private Long id;
    private String accountName;


    public Account(Long id, String accountName) {
        this.id = id;
        this.accountName = accountName;
    }

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
