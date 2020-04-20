package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Zakupy", LocalDate.of(1995, 5, 22), LocalDate.of(1996, 6, 10)));
        tasks.add(new Task("Zakupy", LocalDate.of(2000, 5, 2), LocalDate.of(2001, 6, 20)));
        tasks.add(new Task("Zakupy", LocalDate.of(2001, 12, 12), LocalDate.of(2021, 2, 5)));
        tasks.add(new Task("Zakupy", LocalDate.of(1212, 2, 15), LocalDate.of(3125, 9, 14)));
        return tasks;
    }
}
