package com.kodilla.spring.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.util.calendar.BaseCalendar;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class CarConfiguration {

    private List<String> seasons = new ArrayList<>();

    private void addingSeasons() {
        seasons.add("Summer");
        seasons.add("Winter");
        seasons.add("Spring");
        seasons.add("Autumn");
    }

//    public void shouldSwitchLight(Car car) {
//        int date = java.time.LocalTime.now().getHour();
//        if (date > 20 || date < 6) {
//            car.hasHeadlightTurnedOn();
//        }
//    }



    @Bean
    @Value("Winter")
    public Car carFinder(String season) {
        Car car;
        if (season.equals("Summer")) {
            car = new Cabrio();
            car.hasHeadlightTurnedOn();
        } else if (season.equals("Winter")) {
            car = new SUV();
            car.hasHeadlightTurnedOn();
        } else {
            car = new Sedan();
            car.hasHeadlightTurnedOn();
        }
            return car;
        }
    }

