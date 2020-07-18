package com.ercan.OpenClosed.app;

import com.ercan.OpenClosed.*;
import com.ercan.OpenClosed.enumtype.CarType;
import com.ercan.OpenClosed.impl.BMW;
import com.ercan.OpenClosed.impl.Mercedes;
import com.ercan.OpenClosed.impl.Toyota;

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
