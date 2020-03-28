package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car opel = new Opel(20, 5, 10);
        Car bmw = new BMW(50, 10, 2);
        Car mercedes = new Mercedes(30, 20, 10);

        doRace(opel);
        doRace(bmw);
        doRace(mercedes);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
