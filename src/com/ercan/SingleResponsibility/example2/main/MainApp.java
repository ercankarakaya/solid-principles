package com.ercan.SingleResponsibility.example2.main;

import com.ercan.SingleResponsibility.example2.entity.Address;
import com.ercan.SingleResponsibility.example2.entity.User;
import com.ercan.SingleResponsibility.example2.service.UserService;
import com.ercan.SingleResponsibility.example2.service.UserServiceImpl;

public class MainApp {
    public static void main(String[] args) {


         UserService userService=new UserServiceImpl();


        User user1=new User(1,"ali","can",new Address("Ankara","Kızılay","Turkey"));
        User user2=new User(2,"ercan","kaya",new Address("Londra","Manu123","England"));

        userService.save(user1);
        userService.save(user2);
        System.out.println(userService.findAll());

    }
}
