package com.kodilla.abstracts.homework;


public abstract class Shape {

    int radius, side, diameter;

    public Shape(int radius, int side, int diameter){
        this.radius = radius;
        this.side = side;
        this.diameter = diameter;
    }

    public abstract void surfaceArea();

    public abstract void circumference();
}
