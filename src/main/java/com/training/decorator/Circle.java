package com.training.decorator;

/**
 * Created by adame on 5/30/2017.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Oh hi! I'm a circle!");
    }
}
