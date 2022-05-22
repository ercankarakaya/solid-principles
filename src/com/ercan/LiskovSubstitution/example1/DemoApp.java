package com.ercan.LiskovSubstitution.example1;

import com.ercan.LiskovSubstitution.example1.Bird;
import com.ercan.LiskovSubstitution.example1.Flyable;
import com.ercan.LiskovSubstitution.example1.impl.Crow;
import com.ercan.LiskovSubstitution.example1.impl.Ostrich;
import com.ercan.LiskovSubstitution.example1.impl.Penguen;
import com.ercan.LiskovSubstitution.example1.impl.Sparrow;

import java.util.Arrays;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {

        List<Bird> birds = Arrays.asList(new Crow(), new Ostrich(), new Sparrow(), new Penguen());
        List<Flyable> flyables = Arrays.asList(new Crow(), new Sparrow());
        birds.forEach(b -> {
            if (b instanceof Crow) {
                b.eat("mouse");
            } else if (b instanceof Ostrich) {
                b.eat("insect");
            } else if (b instanceof Sparrow) {
                b.eat("insect");
            } else if (b instanceof Penguen) {
                b.eat("fish");
            }
        });

        flyables.forEach(bird -> bird.fly());
    }
}
