package com.kodilla.stream.exception.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void isOrderExist_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("12345");
        warehouse.addOrder(order);
        //when
        Order itsNotExist = warehouse.getOrder("54321");
        //then
        assertEquals(itsNotExist.getNumber(), "12345");
    }
}