package com.ercan.OpenClosed.example1.enumtype;

public enum  CarType {

    BMW("BMW"),MERCEDES("MERCEDES"),TOYOTA("TOYOTA");

    private final String type;

    CarType(String type) {
        this.type = type;
    }
}
