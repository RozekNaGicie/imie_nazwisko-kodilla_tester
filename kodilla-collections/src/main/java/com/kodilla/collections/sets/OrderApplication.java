package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2020", "Notebook", 1));
        orders.add(new Order("2/2020", "Iron", 1));
        orders.add(new Order("3/2020", "Table", 1));
        orders.add(new Order("4/2020", "Mac", 1));
        orders.add(new Order("4/2020", "Mac", 1)); // zamowienie omylkowe
        orders.add(new Order("5/2020", "Mac", 1));

        System.out.println(orders.size());
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }
}
