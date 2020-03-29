package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

public class ShapeUtils {

    public static void displayInfo(Shape shape) {
        System.out.println("---------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getSurfaceArea());
        System.out.println("Shape circumference: " + shape.getCircumference());
    }
    private static String getShapeName(Shape shape){
        if(shape instanceof Circle)
            return "circle";
        else if(shape instanceof Triangle)
            return "triangle";
        else if (shape instanceof Square)
            return "square";
        else
            return "Unkown shape name";
    }
}
