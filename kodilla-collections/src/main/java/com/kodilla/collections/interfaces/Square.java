package com.kodilla.collections.interfaces;

public class Square implements Shape {

    double width;

    public Square(double width) {
        this.width = width;
    }

    private double surfaceArea() {
        double surfaceArea = this.width * this.width;
        return surfaceArea;
    }

    public double getSurfaceArea() { // getter do pola powierzchni kwadratu
        return surfaceArea();
    }

    private double circumference() {
        double circumference = 4 * this.width;
        return circumference;
    }

    public double getCircumference() { // getter do obwodu kwadratu
        return circumference();
    }

}
