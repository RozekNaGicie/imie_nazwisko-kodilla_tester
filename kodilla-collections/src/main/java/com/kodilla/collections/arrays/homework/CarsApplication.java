package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.*;

public class CarsApplication {

    public static Car drawCar() {
        Car car = new CarsInheritance(Randomizer.getRandom(), Randomizer.getRandom(), Randomizer.getRandom());
        return car;
    }

}
