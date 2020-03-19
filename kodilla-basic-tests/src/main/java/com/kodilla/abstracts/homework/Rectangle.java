package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    int side2;

    public Rectangle(int side, int side2) {
        super(1, side, 1);
        this.side2 = side2;
    }

    @Override
    public void surfaceArea() {

        int surf = side * side2;
        System.out.println("Pole powierzchni prostokatu " + surf);

    }

    @Override
    public void circuit() {

        int circ = 2 * side + 2 * side2;
        System.out.println("obw prostokatu " + circ);

    }
}
