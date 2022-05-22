package com.ercan.OpenClosed.example1.impl;

import com.ercan.OpenClosed.example1.Car;
import com.ercan.OpenClosed.example1.enumtype.CarType;

public class Toyota extends Car {

    public Toyota(String license, CarType carType) {
        super(license, carType);
    }

    @Override
    public double speed(double extra) {
        System.out.print("toyota speed: ");
        return 130 + extra;
    }
}
