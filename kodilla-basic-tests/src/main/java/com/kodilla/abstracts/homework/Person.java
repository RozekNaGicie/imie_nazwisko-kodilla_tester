package com.kodilla.abstracts.homework;

public class Person {

    String firstName = "Mateusz";
    int age = 24;
    ProgramistaJavaScript job = new ProgramistaJavaScript();

    public void respons(){
        System.out.println("Obowiazki w pracy: " + job.respons);
    }

}
