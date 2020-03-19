package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Circle circle = new Circle(3,4);
        circle.circuit();
        circle.surfaceArea();

        Square square = new Square(3);
        square.circuit();
        square.surfaceArea();

        Rectangle rectangle = new Rectangle(2,5);
        rectangle.circuit();
        rectangle.surfaceArea();

    }
}
