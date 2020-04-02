package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0 &&
                Double.compare(triangle.height, height) == 0 &&
                Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, hypotenuse);
    }
}


