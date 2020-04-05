package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExamp {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        school.put(new Student("Mateusz", "Narozny"), new Grades(5.0, 2.5, 3.0, 3.5));
        school.put(new Student("Maciej", "Bober"), new Grades(2.0, 2.5, 5.0, 4.5));
        school.put(new Student("Tomasz", "Boberek"), new Grades(3.0, 5.5, 2.0, 4.5));

        for (Map.Entry<Student, Grades> student: school.entrySet()) {
            System.out.println(student);
        }
    }
}
