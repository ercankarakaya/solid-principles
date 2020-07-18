package com.ercan.OpenClosed;

import com.ercan.OpenClosed.enumtype.CarType;

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
