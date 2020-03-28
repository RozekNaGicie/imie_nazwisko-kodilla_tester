package com.kodilla.collections.interfaces.homework;

public class CarsInheritance implements Car {

    private int currentSpeed;
    private int howMuchIncrease;
    private int howMuchDecrease;

    public CarsInheritance(int currentSpeed, int howMuchIncrease, int howMuchDecrease) {
        this.currentSpeed = currentSpeed;
        this.howMuchIncrease = howMuchIncrease;
        this.howMuchDecrease = howMuchDecrease;
    }

    @Override
    public int getSpeed() {
        return currentSpeed;
    }

    @Override
    public void increaseSpeed() {
        currentSpeed += howMuchIncrease;
        System.out.println("Przyspieszasz o " + howMuchIncrease + "km/h");
    }

    @Override
    public void decreaseSpeed() {
        currentSpeed -= howMuchDecrease;
        System.out.println("Zwalniasz o " + howMuchDecrease + "km/h");
    }
}
