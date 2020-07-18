package com.ercan.LiskovSubstitution.impl;

import com.ercan.LiskovSubstitution.Bird;
import com.ercan.LiskovSubstitution.Flyable;

public class Crow implements Bird, Flyable {

    @Override
    public void eat(String food) {
        System.out.println("Crow eat: " + food);
    }

    @Override
    public void fly() {
        System.out.println("Crow fly..");
    }
}
