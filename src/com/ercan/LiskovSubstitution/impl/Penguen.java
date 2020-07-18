package com.ercan.LiskovSubstitution.impl;

import com.ercan.LiskovSubstitution.Bird;

public class Penguen implements Bird {
    @Override
    public void eat(String food) {
        System.out.println("Penguen eat: " + food);
    }
}
