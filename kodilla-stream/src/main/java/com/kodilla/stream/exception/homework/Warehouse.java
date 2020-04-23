package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> warehouses;

    public Warehouse() {
        warehouses = new ArrayList<>();
    }

    public void addOrder(Order order) {
        List<Order> itsUnique = warehouses
                .stream()
                .filter(e -> e.equals(order))
                .collect(Collectors.toList());
        if (itsUnique.isEmpty())
            warehouses.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> result = getWarehouses()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .collect(Collectors.toList());
        if (result.isEmpty())
            throw new OrderDoesntExistException();
        return result.get(0);
    }

    public List<Order> getWarehouses() {
        return warehouses;
    }

}
