package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        Shape square = new Square(2.5);
        getInfoAboutShape(square);
        Shape circle = new Circle(10);
        getInfoAboutShape(circle);
        Shape triangle = new Triangle(2, 3, 4);
        getInfoAboutShape(triangle);
    }

    private static void getInfoAboutShape(Shape shape) {
        System.out.println(shape.getCircumference());
        System.out.println(shape.getSurfaceArea());
    }
}
