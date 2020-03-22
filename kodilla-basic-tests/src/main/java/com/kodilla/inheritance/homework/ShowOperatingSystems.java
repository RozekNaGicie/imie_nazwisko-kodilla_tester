package com.kodilla.inheritance.homework;

public class ShowOperatingSystems {

    public static void main(String[] args) {

        OperatingSystem os = new OperatingSystem(1987);
        os.turnOn();
        os.turnOff();

        Microsoft mic = new Microsoft(1990);
        mic.turnOn();
        mic.turnOff();

        Linux lin = new Linux(2000);
        lin.turnOn();
        lin.turnOff();
    }
}
