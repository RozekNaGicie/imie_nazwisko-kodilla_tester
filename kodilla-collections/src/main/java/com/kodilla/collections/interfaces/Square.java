package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width);
    }
}
