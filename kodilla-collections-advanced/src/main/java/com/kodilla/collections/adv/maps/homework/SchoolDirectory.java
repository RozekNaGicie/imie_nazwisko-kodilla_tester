package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directorMap = new HashMap<>();

        Principal princ1 = new Principal("Maciej", "Wódka"); // dyrektor 1
        Principal princ2 = new Principal("Tomasz", "Piwko"); // dyrektor 2
        Principal princ3 = new Principal("Robert", "Samogona"); // dyrektor 3

        School school1 = new School(new int[]{24, 32, 12}); // szkola nr 1
        School school2 = new School(new int[]{12, 15, 20}); // szkola nr 2
        School school3 = new School(new int[]{14, 25, 30}); // szkola nr 3

        directorMap.put(princ1, school1); // dodawanie do mapy
        directorMap.put(princ2, school2); // dodawanie do mapy
        directorMap.put(princ3, school3); // dodawanie do mapy

        for (Map.Entry<Principal, School> principalInfo : directorMap.entrySet()) {
            System.out.println(principalInfo.getKey());
            System.out.println("Number of students " + principalInfo.getValue().getNumberOfStudents());
        }
    }
}