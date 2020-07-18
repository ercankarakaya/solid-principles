package com.ercan.InterfaceSegregation.impl;

import com.ercan.InterfaceSegregation.Doc;
import com.ercan.InterfaceSegregation.UserDataOperation;

public class User implements UserDataOperation<Doc> {
    @Override
    public void read(Doc doc) {
        System.out.println("User read " + doc.getDocName());
    }

    @Override
    public void write(Doc doc) {
        System.out.println("User write " + doc.getDocName());
    }

 /*   @Override
    public void update(Doc doc) {
        throw new UnsupportedOperationException("Admin rights required for update!");
    }

    @Override
    public void delete(Doc doc) {
        throw new UnsupportedOperationException("Admin rights required for delete!");
    }

  */
}
