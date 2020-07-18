package com.ercan.InterfaceSegregation.impl;

import com.ercan.InterfaceSegregation.Doc;
import com.ercan.InterfaceSegregation.ManagerDataOperation;
import com.ercan.InterfaceSegregation.UserDataOperation;

public class Manager implements ManagerDataOperation<Doc>, UserDataOperation<Doc> {
    @Override
    public void read(Doc doc) {
        System.out.println("Manager read " + doc.getDocName());
    }

    @Override
    public void write(Doc doc) {
        System.out.println("Manager write " + doc.getDocName());
    }

    @Override
    public void update(Doc doc) {
        System.out.println("Manager update " + doc.getDocName());
    }

    @Override
    public void delete(Doc doc) {
        System.out.println("Manager delete " + doc.getDocName());
    }
}
