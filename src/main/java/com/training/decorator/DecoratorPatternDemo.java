package com.training.decorator;

/**
 * Created by adame on 5/30/2017.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Regular circle");
        circle.draw();

        System.out.println("Red circle");
        redCircle.draw();

        System.out.println("Red rectangle");
        redRectangle.draw();
    }
}
