package com.kodilla.spring.spring_configuration.homework;

import com.kodilla.spring.spring_configuration.Dog;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldCreateSUV() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carFinder");
        //When

        //Then
        Assertions.assertEquals("SUV", car.getCarType());
    }

    @Test
    public void shouldHaveLightsOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carFinder");
        //When
        //Then
        Assertions.assertEquals(true, car.hasHeadlightTurnedOn());
//    @Test
//    public void shouldGiveNull() {
//        //Given
//        CarConfiguration carconf = new CarConfiguration();
//        Car findCar = carconf.carFinder("Winterrzzzz");
//        //Then
//        Assertions.assertNull(findCar.getCarType());
//    }
    }
}
