package com.kodilla.spring.spring_configuration.homework;

public class SUV implements Car {

    boolean lights;

    @Override
    public boolean hasHeadlightTurnedOn() {
        int date = java.time.LocalTime.now().getHour();
        if (date > 20 || date < 6) {
            return lights = true;
        } else {
            return lights = false;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
