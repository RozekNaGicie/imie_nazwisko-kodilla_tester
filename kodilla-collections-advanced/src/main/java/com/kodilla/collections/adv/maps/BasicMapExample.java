package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Matematyka", 4.5);
        grades.put("Polski", 4.5);
        grades.put("Fizyka", 5.0);

        System.out.println(grades.get("Matematyka"));

        for (Map.Entry<String, Double> notes: grades.entrySet()) {
            System.out.println("Ocena z " + notes.getKey() + " to " + notes.getValue());
        }
    }
}
