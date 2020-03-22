package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Circle circle = new Circle(3,4);
        circle.circumference();
        circle.surfaceArea();

        Square square = new Square(3);
        square.circumference();
        square.surfaceArea();

        Rectangle rectangle = new Rectangle(2,5);
        rectangle.circumference();
        rectangle.surfaceArea();

        // zadanie 2  - job i respons;
        Person mateusz = new Person();
        mateusz.respons();
    }
}
