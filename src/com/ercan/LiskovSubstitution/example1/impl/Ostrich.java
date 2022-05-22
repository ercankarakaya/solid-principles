package com.ercan.LiskovSubstitution.example1.impl;

import com.ercan.LiskovSubstitution.example1.Bird;

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
