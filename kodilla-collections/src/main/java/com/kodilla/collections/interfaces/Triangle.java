package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    double width;
    double height;
    double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    private double surfaceArea() {
        double surfaceArea = width * height / 2;
        return surfaceArea;
    }

    @Override
    public double getSurfaceArea() {
        return surfaceArea();
    }

    private double circumference() {
        double circumference = width + height + hypotenuse;
        return circumference;
    }

    @Override
    public double getCircumference() {
        return circumference();
    }
}
