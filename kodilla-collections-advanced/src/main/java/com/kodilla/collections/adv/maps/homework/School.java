package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<int[]> studentMap = new ArrayList<>();
    private int[] studentList;

    public School(int[] studentList) {
        this.studentList = studentList;
    }

    private int numberOfStudents() { // obliczenie liczby uczniow w szkole
        int sum = 0;
        for (int student : this.studentList) {
            sum += student;
        }
        return sum;
    }

    // gettery
    public List<int[]> getStudentMap() {
        return studentMap;
    }

    public int getNumberOfStudents() {
        return numberOfStudents();
    }
}
