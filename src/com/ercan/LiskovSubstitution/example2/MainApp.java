package com.ercan.LiskovSubstitution.example2;

import com.ercan.LiskovSubstitution.example2.impl.Rectangle;
import com.ercan.LiskovSubstitution.example2.impl.Square;

public class MainApp {
    public static void main(String[] args) {

        // rectangle area
        Shape rectangle = new Rectangle(30, 10);
        System.out.println("rectangle area : " + rectangle.area());

        // square area
        Shape square = new Square(10);
        System.out.println("square area : " + square.area());

    }
}
