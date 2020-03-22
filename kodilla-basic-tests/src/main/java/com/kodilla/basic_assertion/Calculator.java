package com.kodilla.basic_assertion;

public class Calculator {

    public int add(int temp1, int temp2) {
        int sum = temp1 + temp2;
        return sum;
    }

    public int substract(int temp1, int temp2) {
        int substract = temp1 - temp2;
        return substract;
    }

    public int pow(int temp1) {
        double pow = Math.pow(temp1, 2);
        int powInt = (int) pow;
        return powInt;
    }
}
