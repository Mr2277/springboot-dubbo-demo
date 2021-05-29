package com.lls.factory.car.factory;

import com.lls.factory.car.simple.AbstractCar;

public class FactoryClient {
    public static void main(String[] args) {
        BenCarFactory benCarFactory = new BenCarFactory();
        AbstractCar benCar = benCarFactory.createCar();
        benCar.drive();

        BmwCarFactory bmwCarFactory = new BmwCarFactory();
        AbstractCar bmwCar = bmwCarFactory.createCar();
        bmwCar.drive();
    }
}
