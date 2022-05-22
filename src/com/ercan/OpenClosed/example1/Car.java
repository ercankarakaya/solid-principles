package com.ercan.OpenClosed.example1;

import com.ercan.OpenClosed.example1.enumtype.CarType;

public abstract class Car {

    protected String license;
    protected String color;

    protected CarType carType;


    public Car(String license, CarType carType) {
        this.license = license;
        this.carType = carType;
        System.out.println(this.getClass().getSimpleName() + " : " + license);
    }

    public abstract double speed(double extra);


}
