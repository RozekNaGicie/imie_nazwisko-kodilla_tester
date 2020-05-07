package com.kodilla.spring.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime time;
    public Clock(){
        time =java.time.LocalTime.now();
    }

    public LocalTime getTime() {
        return time;
    }
}
