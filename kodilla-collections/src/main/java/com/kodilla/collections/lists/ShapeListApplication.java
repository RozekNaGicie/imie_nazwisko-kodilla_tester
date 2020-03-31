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
        squares.add(new Square(3));

        for (Square square: squares) {
            System.out.println(square.toString());
        }

    }
}
