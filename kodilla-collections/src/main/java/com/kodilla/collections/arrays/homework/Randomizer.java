package com.kodilla.collections.arrays.homework;

import java.util.Random;

public class Randomizer {

    private static Random rand = new Random();

    private static int randomNumber() {
        return rand.nextInt(100);
    }

    public static int getRandom() {
        return randomNumber();
    }

}
