package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int temp1 = 5;
        int temp2 = 5;

        int sum = calc.add(temp1, temp2);
        int sub = calc.substract(temp1, temp2);
        int pow = calc.pow(temp1);

        // Unit test Add
        boolean testAdd = ResultChecker.assertEquals(sum, 10);
        System.out.println(testAdd);

        // Unit test Substract
        boolean testSub = ResultChecker.assertEquals(sub, 2);
        System.out.println(testSub);

        // Unit test Pow
        boolean testPow = ResultChecker.assertEquals(pow, 25);
        System.out.println(testPow);

    }

}
