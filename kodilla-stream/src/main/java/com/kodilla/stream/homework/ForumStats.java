package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {

    public static void main(String[] args) {
        try {
            double avgMoreThan40 = UserRepository.getUsersList()
                    .stream()
                    .filter(u -> u.getAge() >= 40)
                    .map(User::getNumberOfPosts)
                    .mapToDouble(n -> n)
                    .average()
                    .orElseThrow(AverageDoesntExistException::new);
            System.out.println("Average number of post for Users in age >= 40: " + avgMoreThan40);
        } catch (AverageDoesntExistException e) {
            System.out.println("There is no Users that fulfilling this goal");
        }

        try {
            double avgLessThan40 = UserRepository.getUsersList()
                    .stream()
                    .filter(u -> u.getAge() < 40)
                    .map(User::getNumberOfPosts)
                    .mapToDouble(n -> n)
                    .average()
                    .orElseThrow(AverageDoesntExistException::new);
            System.out.println("Average number of post for Users in age < 40: " + avgLessThan40);
        } catch (AverageDoesntExistException e) {
            System.out.println("There is no Users that fulfilling this goal");
        }
    }
}
