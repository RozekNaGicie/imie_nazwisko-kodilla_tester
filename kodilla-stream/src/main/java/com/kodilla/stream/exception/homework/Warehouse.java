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
        return  getWarehouses()
                .stream()
//                .filter(n -> n.getNumber().equals(number)).findFirst().orElseThrow(OrderDoesntExistException::new);
                .filter(n -> n.getNumber().equals(number)).findFirst().orElseThrow(() -> new OrderDoesntExistException("There is no order like this in database"));
    }

    public List<Order> getWarehouses() {
        return warehouses;
    }
}
