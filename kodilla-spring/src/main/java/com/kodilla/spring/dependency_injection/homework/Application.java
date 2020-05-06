package com.kodilla.spring.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        ShippingCenter shippingCenter = new ShippingCenter(new SuccesOrFailDelivery(), new IsWeightOk());
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
