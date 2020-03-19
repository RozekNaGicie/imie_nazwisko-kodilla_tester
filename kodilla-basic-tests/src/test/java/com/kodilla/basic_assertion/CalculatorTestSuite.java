package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calc = new Calculator();
        int temp1 = 5;
        int temp2 = 5;
        int sum = calc.add(temp1, temp2);
        assertEquals(sum,10);

    }
}
