package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> linkedShapes = new LinkedList<>();

        Square square = new Square(2);
        linkedShapes.add(square);
        linkedShapes.add(new Triangle(5,2,3));
        linkedShapes.add(new Circle(15));

        linkedShapes.remove(1);
        linkedShapes.remove(square);
        linkedShapes.remove(new Circle(15));

        for (Shape shapes: linkedShapes) {
            System.out.println(shapes.toString());
            System.out.println(shapes.getSurfaceArea());
            System.out.println(shapes.getCircumference());
            System.out.println("----------------------------");
        }
    }
}
