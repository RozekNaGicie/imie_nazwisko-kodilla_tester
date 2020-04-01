package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {

    public static void main(String[] args) {
        Shape square = new Square(2);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Triangle(2, 2, 3));
        shapes.add(square);
        shapes.add(new Circle(5));
        shapes.add(new Triangle(5, 2, 6));

        System.out.println(shapes.size());

        for (Shape shape : shapes) {
            System.out.println("Pole powierzchni: " + shape.getSurfaceArea());
            System.out.println("Obwód: " + shape.getCircumference());
            System.out.println(shape.toString());
        }
        shapes.remove(0);
        System.out.println("Długość tablicy: " + shapes.size());
        shapes.remove(square);
        System.out.println("Długość tablicy: " + shapes.size());
    }
}
