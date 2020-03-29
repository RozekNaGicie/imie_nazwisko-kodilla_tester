package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.*;

public class CarsApplication {

    private static Randomizer rand = new Randomizer();

    public static Car drawCar() {
        Car car = new CarsInheritance(rand.getRandom(), rand.getRandom(), rand.getRandom());
        return car;
    }

}
