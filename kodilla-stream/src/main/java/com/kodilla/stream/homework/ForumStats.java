package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {

    public static void main(String[] args) {
        double avgMoreThan40 = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPosts)
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("Srednia postow dla uzytkownikow >= 40: " + avgMoreThan40);

        double avgLessThan40 = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("Srednia postow dla uzytkownikow < 40: " + avgLessThan40);
    }
}
