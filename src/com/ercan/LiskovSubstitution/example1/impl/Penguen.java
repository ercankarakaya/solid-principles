package com.ercan.LiskovSubstitution.example1.impl;

import com.ercan.LiskovSubstitution.example1.Bird;

public class Penguen implements Bird {
    @Override
    public void eat(String food) {
        System.out.println("Penguen eat: " + food);
    }
}
