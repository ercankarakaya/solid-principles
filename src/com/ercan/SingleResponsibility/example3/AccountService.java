package com.ercan.SingleResponsibility.example3;

public class AccountService {

    AccountRepository accountRepository = new AccountRepository();
    NotificationService notificationService = new NotificationService();

    public void openAccount() {
        //1
        System.out.println("fill account details");

        //2
        accountRepository.create(new Account(1L,"Account1"));

        //3
        notificationService.sendNotification(new String("Notification message."));

    }


    /**
     * This is NOT suitable for SOLID.
     */
  /*
   public void openAccount() {
        //1
        System.out.println("fill account details");

        //2
        System.out.println("store account object in database");

        //3
        System.out.println("send out welcome message");
    }
     */


}
