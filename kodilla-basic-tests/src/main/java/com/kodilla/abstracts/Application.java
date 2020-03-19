package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {

//        Dog newDog = new Dog();
//        newDog.giveVoice();
//
//        Duck newDuck = new Duck();
//        newDuck.giveVoice();

        Dog dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

    }

}
