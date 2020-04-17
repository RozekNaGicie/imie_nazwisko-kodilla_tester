package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> pickedFlights = new ArrayList<>();
        pickedFlights.add(new Flight("Londyn", "Madryt"));
        pickedFlights.add(new Flight("Warszawa", "Seul"));
        pickedFlights.add(new Flight("Tokio", "Madryt"));
        pickedFlights.add(new Flight("Paryż", "Barcelona"));
        return pickedFlights;
    }
}
