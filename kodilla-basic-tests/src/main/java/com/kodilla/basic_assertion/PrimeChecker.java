package com.kodilla.basic_assertion;

public class PrimeChecker {

    public boolean isPrime(int prime) {

        if (prime <= 1) return false;

        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

}
