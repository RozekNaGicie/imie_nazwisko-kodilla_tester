package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    private List<Double> grades = new ArrayList<>();

    public Grades(double... grades) {
        for (double grade : grades) {
            this.grades.add(grade);
        }
    }

    private double average() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double getAverage() {
        return average();
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grades=" + grades +
                '}';
    }
}
