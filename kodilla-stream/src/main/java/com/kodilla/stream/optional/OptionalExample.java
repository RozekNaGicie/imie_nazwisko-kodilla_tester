package com.kodilla.stream.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        User user = new User("Adam", 0, 0, "koniki");
        Optional<User> optionalUser = Optional.ofNullable(user);
//        String username = optionalUser.orElse(new User("", 0, 0,"")).getUsername();
//        System.out.println(username);
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
