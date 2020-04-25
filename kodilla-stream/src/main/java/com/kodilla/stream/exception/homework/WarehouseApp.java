package com.kodilla.stream.exception.homework;

import java.util.List;

public class WarehouseApp {

    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("12323"));
        warehouse.addOrder(new Order("35245"));
        warehouse.addOrder(new Order("64675"));
        warehouse.addOrder(new Order("64675"));
        for (Order order : warehouse.getWarehouses()) {
            System.out.println(order.toString());
        }
//        Order order = null;
//        try {
//            order = warehouse.getOrder("64676");
//            System.out.println(order.toString() + "Wyswietone zamowienie");
//        } catch (OrderDoesntExistException e) {
//            System.out.println("Zamowienie nie istnieje");
//        }
        Order order = warehouse.getOrder("64676");
        System.out.println(order);
    }
}
