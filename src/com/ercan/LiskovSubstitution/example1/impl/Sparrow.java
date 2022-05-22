package com.ercan.LiskovSubstitution.example1.impl;

import com.ercan.LiskovSubstitution.example1.Bird;
import com.ercan.LiskovSubstitution.example1.Flyable;

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
