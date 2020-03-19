package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    double pi;

    public Circle(int radius, int diameter) {
        super(radius, 1, diameter);
        this.pi = 3.14;
    }

    @Override
    public void surfaceArea() {

        double surface = pi * Math.pow(radius, 2);
        System.out.println("Pole powierzchni kola " + surface);

    }

    @Override
    public void circuit() {

        double circ = 2 * pi * radius;
        System.out.println("Obwod kola " + circ);

    }
}
