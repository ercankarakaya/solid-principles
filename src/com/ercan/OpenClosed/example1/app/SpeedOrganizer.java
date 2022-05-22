package com.ercan.OpenClosed.example1.app;

import com.ercan.OpenClosed.example1.Car;
import com.ercan.OpenClosed.example1.enumtype.CarType;
import com.ercan.OpenClosed.example1.impl.BMW;
import com.ercan.OpenClosed.example1.impl.Mercedes;
import com.ercan.OpenClosed.example1.impl.Toyota;

public class SpeedOrganizer {

    public static void main(String[] args) {
        Car car = new Mercedes("MR123", CarType.MERCEDES);
        System.out.println(calculateSpeed(car, 10));

        car = new BMW("BW98i", CarType.BMW);
        System.out.println(calculateSpeed(car, 12));

        car = new Toyota("TYT77", CarType.TOYOTA);
        System.out.println(calculateSpeed(car, 9));

    }
    public static double calculateSpeed(Car car, double extra) {
        return car.speed(extra);
    }

}
