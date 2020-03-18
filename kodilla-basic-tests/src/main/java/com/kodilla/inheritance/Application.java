package com.kodilla.inheritance;

public class Application {
    public static void main (String[] args){
        Car newCar = new Car(4,5);
        Covertible newCovertible = new Covertible(4,2);
        newCovertible.closeRoof();
        System.out.println(newCar.getSeats());
        System.out.println(newCovertible.getSeats());

    }
}
