package com.kodilla.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {

    public static void main(String[] args) {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Trolle")) // zwraca true lub false w zaleznosci czy ma zostać przepuszczone
                .map(UserManager::getUserName)
                // lub przez lambde .map(u -> u.getUsername)
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
