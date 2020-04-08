package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("Car: " + getCarName(car));
        System.out.println("Current speed is: " + car.getSpeed());
        car.increaseSpeed();
        car.decreaseSpeed();
    }

    private static String getCarName(Car car) {
        int rand = Randomizer.getRandom();
        if (rand < 33)
            return "Opel";
        if (rand > 33 && rand < 66)
            return "Mercedes";
        if (rand > 66)
            return "Bmw";
        return "Car doesn't exist";
    }

}
