package com.ercan.LiskovSubstitution.impl;

import com.ercan.LiskovSubstitution.Bird;

public class Ostrich implements Bird {

    @Override
    public void eat(String food) {
        System.out.println("Ostrich eat: " + food);
    }

 /*   @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!!");
    }

  */
}
