package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    private PrimeChecker check = new PrimeChecker();
    private static int count = 0;

    private static void counting() {

        count++;
        System.out.println("Test case nr " + count);
    }

    @Test
    public void shouldReturnFalseWhenPassingNotPrime() {
        boolean result = check.isPrime(14);
        assertFalse(result);
        counting();
    }

    @Test
    public void shouldReturnTrueWhenPassingPrime() {
        boolean result = check.isPrime(13);
        assertTrue(result);
        counting();
    }

    @Test
    public void shouldReturnTrueWhenIsTwo() {
        boolean result = check.isPrime(2);
        assertTrue(result);
        counting();
    }

    @Test
    public void shouldReturnFalseWhenIsOne() {
        boolean result = check.isPrime(1);
        assertFalse(result);
        counting();
    }

    @Test
    public void shouldReturnFalseWhenIsZero() {
        boolean result = check.isPrime(0);
        assertFalse(result);
        counting();
    }

    @Test
    public void shouldReturnFalseWhenIsMinus() {
        boolean result = check.isPrime(-3);
        assertFalse(result);
        counting();
    }


}
