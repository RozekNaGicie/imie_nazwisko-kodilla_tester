package com.kodilla.stream.exception;

public class FirstExample {
    public static void main(String[] args) {
//        String username = "Willy Wonka";
//        String username = null;
        String username = "John";
        String[] nameParts = username.split(" ");
        System.out.println("Firstname: " + nameParts[0]);
        System.out.println("Lastame: " + nameParts[1]);
    }
}
