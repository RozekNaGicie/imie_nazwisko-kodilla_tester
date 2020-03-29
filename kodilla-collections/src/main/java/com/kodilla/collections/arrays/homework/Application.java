package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rand = new Random();
        int bound = rand.nextInt(15) + 1;
        Car[] arr = new Car[bound];
        for (Car car : arr) {
            CarsApplication.drawCar();
        }
        for (int i = 0; i < arr.length; i++) {
            CarUtils.describeCar(arr[i]);
        }
    }
}
