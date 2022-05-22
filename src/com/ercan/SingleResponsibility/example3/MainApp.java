package com.ercan.SingleResponsibility.example3;

public class MainApp {
    public static void main(String[] args) {
        AccountService accountService=new AccountService();
        accountService.openAccount();
    }
}
