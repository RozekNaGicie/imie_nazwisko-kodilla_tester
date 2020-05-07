package com.kodilla.spring.spring_scopes;

import com.kodilla.spring.spring_scopes.homework.Clock;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class ClockTestSuite {
    @Test
    public void shouldCreateDifferentTasks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        Clock fourBean = context.getBean(Clock.class);

        System.out.println(firstBean.getTime());
        System.out.println(secondBean.getTime());
        System.out.println(thirdBean.getTime());
        System.out.println(fourBean.getTime());

        Assertions.assertNotEquals(firstBean, secondBean, "First and second objects are diffrent");
        Assertions.assertNotEquals(secondBean, thirdBean, "Second and third objects are diffrent");
        Assertions.assertNotEquals(firstBean, thirdBean, "First and third objects are diffrent");
    }
}
