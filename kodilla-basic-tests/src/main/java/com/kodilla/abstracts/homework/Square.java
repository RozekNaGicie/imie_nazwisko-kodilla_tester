package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int side) {
        super(1, side, 1);
    }

    @Override
    public void surfaceArea() {
        int surface = side * side;
        System.out.println("Pole powierzchni kwadratu " + surface);
    }

    @Override
    public void circumference() {
        int circ = 4 * side;
        System.out.println("obw kwadratu " + circ);
    }
}
