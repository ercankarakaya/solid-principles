package com.ercan.LiskovSubstitution.example1.impl;

import com.ercan.LiskovSubstitution.example1.Bird;
import com.ercan.LiskovSubstitution.example1.Flyable;

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
