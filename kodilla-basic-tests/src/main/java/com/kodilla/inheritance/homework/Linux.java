package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Nadpisane przez Linux");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Nadpisane przez Linux");
    }

}
