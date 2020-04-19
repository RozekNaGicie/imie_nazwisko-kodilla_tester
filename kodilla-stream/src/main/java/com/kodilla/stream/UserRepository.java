package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> getUsersList(){
        List<User> users = new ArrayList<>();
        users.add(new User("Maciek",14, 20,"Trolle" ));
        users.add(new User("Artur",12, 5,"Mole" ));
        users.add(new User("Mateusz",18, 12,"Golarki" ));
        users.add(new User("Wojtek",34, 22,"Fajne Znaczki" ));
        return users;
    }
}
