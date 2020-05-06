package com.kodilla.spring.spring_dependency_injection.homework;

import com.kodilla.spring.spring_dependency_injection.SkypeMessageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void IsAddedValueCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator bean = context.getBean(Calculator.class);
        double operation = bean.add(5.0, 5.0);
        Assertions.assertEquals(10.0, operation);
    }

    @Test
    public void IsSubtractValueCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator bean = context.getBean(Calculator.class);
        double operation = bean.subtract(5.0, 5.0);
        Assertions.assertEquals(0.0, operation);
    }

    @Test
    public void IsMultiplyValueCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator bean = context.getBean(Calculator.class);
        double operation = bean.multiply(5.0, 5.0);
        Assertions.assertEquals(25.0, operation);
    }

    @Test
    public void IsDivideValueCorrect() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator bean = context.getBean(Calculator.class);
        double operation = bean.divide(5.0, 5.0);
        Assertions.assertEquals(1.0, operation);
    }
}
