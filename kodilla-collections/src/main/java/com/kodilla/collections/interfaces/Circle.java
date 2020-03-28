package com.kodilla.collections.interfaces;

public class Circle implements Shape {

    double radius;
    final double pi = Math.PI;
    public Circle(double radius){
        this.radius = radius;
    }
    private double surfaceArea(){
        double surfaceArea = pi * Math.pow(radius,2);
        return surfaceArea;
    }
    public double getSurfaceArea(){
        return surfaceArea();
    }
    private double circumference(){
        double circumference = 2 * pi * radius;
        return circumference;
    }
    public double getCircumference(){
        return circumference();
    }

}
