package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directorMap = new HashMap<>();
        List<School> lister = new ArrayList<>();
        directorMap.put(new Principal("Tadeusz", "Wódka"), new School(new ArrayList<Integer>()));
    }
}