package com.ercan.OpenClosed.impl;

import com.ercan.OpenClosed.Car;
import com.ercan.OpenClosed.enumtype.CarType;

public class Mercedes extends Car {

    public Mercedes(String license, CarType carType) {
        super(license, carType);
    }

    @Override
   public double speed(double extra) {
        System.out.print("mercedes speed: ");
        return 150 + extra;
    }
}
