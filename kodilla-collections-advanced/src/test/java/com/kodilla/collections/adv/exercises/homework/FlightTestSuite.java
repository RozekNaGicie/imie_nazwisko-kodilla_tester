package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightTestSuite {

    @Test
    public void findFlightFromPositiveTest() {
        //Given
        FlightFinder flights = new FlightFinder();
        //When
        List<Flight> flightsFrom = flights.findFlightsFrom("Warszawa");
        //Then
        assertEquals(1, flightsFrom.size());
    }

    @Test
    public void findFlightFromNegativeTest() {
        //Given
        FlightFinder flights = new FlightFinder();
        //When
        List<Flight> flightsFrom = flights.findFlightsFrom("Toruń");
        //Then
        assertEquals(0, flightsFrom.size());
    }

    @Test
    public void findFlightToPositiveTest() {
        //Given
        FlightFinder flights = new FlightFinder();
        //When
        List<Flight> flightsTo = flights.findFlightsTo("Madryt");
        //Then
        assertEquals(2, flightsTo.size());
    }

    @Test
    public void findFlightToNegativeTest() {
        //Given
        FlightFinder flights = new FlightFinder();
        //When
        List<Flight> flightsTo = flights.findFlightsTo("Toruń");
        //Then
        assertEquals(0, flightsTo.size());
    }
}