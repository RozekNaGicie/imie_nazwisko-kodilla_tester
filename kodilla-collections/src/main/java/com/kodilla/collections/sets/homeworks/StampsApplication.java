package com.kodilla.collections.sets.homeworks;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Porto", "10x10", false));
        stamps.add(new Stamp("Polski", "10x10", true));
        stamps.add(new Stamp("Wspolczesniak", "10x10", false));
        stamps.add(new Stamp("Porto", "10x10", false)); // powtorzenie
        stamps.add(new Stamp("Porto", "10x10", false)); // powtorzenie
        stamps.add(new Stamp("Porto", "10x10", false)); // powtorzenie

        for (Stamp stamp : stamps) {
            System.out.println(stamp.toString());
        }
    }
}
