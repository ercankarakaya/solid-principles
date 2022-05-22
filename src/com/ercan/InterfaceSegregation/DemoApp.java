package com.ercan.InterfaceSegregation;

import com.ercan.InterfaceSegregation.Doc;
import com.ercan.InterfaceSegregation.UserDataOperation;
import com.ercan.InterfaceSegregation.impl.Manager;
import com.ercan.InterfaceSegregation.impl.User;

public class DemoApp {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.write(new Doc("Add hired users"));
        manager.read(new Doc("Add hired users"));
        manager.update(new Doc("Update hired users"));
        manager.delete(new Doc("Update hired users"));

        UserDataOperation userDataOperation=new User(); // or  User userDataOperation=new User();
        userDataOperation.write(new Doc("Add hired users"));
        userDataOperation.read(new Doc("Add hired users"));


    }
}
