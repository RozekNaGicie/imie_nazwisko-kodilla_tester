package com.kodilla.parametized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {

    private StringValidator stringvalidator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"   "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(stringvalidator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(stringvalidator.isBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfNoString(String text){
        assertTrue(stringvalidator.isBlank(text));
    }
}