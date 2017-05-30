package com.training.decorator;

/**
 * Created by adame on 5/30/2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Oh hello! I'm a rectangle!");
    }
}
