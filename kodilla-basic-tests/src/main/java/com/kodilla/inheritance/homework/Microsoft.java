package com.kodilla.inheritance.homework;

public class Microsoft extends OperatingSystem {

    public Microsoft(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on Nadpisane przez Microsoft");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Nadpisane przez Microsoft");
    }
}
