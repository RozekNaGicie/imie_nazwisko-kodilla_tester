package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> departureList = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getDeparture().equals(departure))
                departureList.add(flight);
        }
        return departureList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> arrivalList = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightTable()) {
            if (flight.getArrival().equals(arrival))
                arrivalList.add(flight);
        }
        return arrivalList;
    }
}
