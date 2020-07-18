package com.ercan.LiskovSubstitution.impl;

import com.ercan.LiskovSubstitution.Bird;
import com.ercan.LiskovSubstitution.Flyable;

public class Sparrow implements Bird, Flyable {

    @Override
    public void eat(String food) {
        System.out.println("Sparrow eat: " + food);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly..");
    }
}
