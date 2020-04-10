package com.kodilla.collections.adv.maps.homework;

public class Principal {
    private String directorName;
    private String directorSurname;

    public Principal(String directorName, String directorSurname) {
        this.directorName = directorName;
        this.directorSurname = directorSurname;
    }

    //gettery
    public String getDirectorName() {
        return directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "directorName='" + directorName + '\'' +
                ", directorSurname='" + directorSurname + '\'' +
                '}';
    }
}
