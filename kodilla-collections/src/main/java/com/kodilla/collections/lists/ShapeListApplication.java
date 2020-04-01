package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {

    public static void main(String[] args) {
        List<Square> squares = new ArrayList<>();

        squares.add(new Square(2));
        squares.add(new Square(5));
        squares.add(new Square(15));

        for (Square square: squares) {
            if(square.getSurfaceArea() > 20)
                System.out.println(square.toString());
        }

    }
}
