package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Maciej", new Teacher("Adam Don")));
        students.add(new Student("Wojetek", null));
        students.add(new Student("Karol", new Teacher("Maciej Bolek")));

        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Imie studenta " + student.getName() + " Imie nauczyciela " + teacher.orElse(new Teacher("<undefined>")).getName());
        }
    }
}

