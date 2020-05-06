package com.kodilla.spring;
import com.kodilla.spring.dependency_injection.MessageService;
import com.kodilla.spring.spring_dependency_injection.SimpleApplication;
import com.kodilla.spring.spring_dependency_injection.SkypeMessageService;
import com.kodilla.spring.spring_dependency_injection.homework.Calculator;
import com.kodilla.spring.spring_dependency_injection.homework.Display;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.java2d.pipe.SpanShapeRenderer;

@SpringBootApplication
public class SpringBasicRunner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Display());
        calculator.add(4,5);
    }
}
