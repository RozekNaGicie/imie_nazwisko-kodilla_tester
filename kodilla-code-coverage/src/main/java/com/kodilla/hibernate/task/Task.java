package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private LocalDate created;
    private int duration;

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }
// NONPARAMETER CONSTRUCTOR FOR HIBERNATE
    public Task(){}

    @Column(name="ID", unique = true)
    @Id
    @NotNull
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "CREATED")
    @NotNull
    public LocalDate getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}