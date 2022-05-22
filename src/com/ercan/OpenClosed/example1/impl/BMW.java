package com.ercan.OpenClosed.example1.impl;

import com.ercan.OpenClosed.example1.Car;
import com.ercan.OpenClosed.example1.enumtype.CarType;

public class BMW extends Car {

    public BMW(String license, CarType carType) {
        super(license, carType);
    }

    @Override
    public  double speed(double extra) {
        System.out.print("bmw speed: ");
        return 120+extra;
    }
}
