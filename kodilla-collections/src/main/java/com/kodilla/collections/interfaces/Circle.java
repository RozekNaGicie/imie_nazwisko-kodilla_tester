package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Circle implements Shape {

    double radius;
    final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double surfaceArea() {
        double surfaceArea = pi * Math.pow(radius, 2);
        return surfaceArea;
    }

    public double getSurfaceArea() {
        return surfaceArea();
    }

    private double circumference() {
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public double getCircumference() {
        return circumference();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.pi, pi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, pi);
    }
}
