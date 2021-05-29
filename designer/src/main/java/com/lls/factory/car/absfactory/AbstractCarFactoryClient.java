package com.lls.factory.car.absfactory;

import com.lls.factory.car.simple.AbstractCar;

public class AbstractCarFactoryClient {
    public static void main(String[] args) {
        AbstractCarFactory benCarFactory = new BenCarFactory();
        AbstractCar benCar = benCarFactory.createCar();
        AbstractCar benJeepCar = benCarFactory.createJeepCar();
        AbstractCar benElecCar = benCarFactory.createElecCar();
        benCar.drive();
        benJeepCar.drive();
        benElecCar.drive();
    }
}
