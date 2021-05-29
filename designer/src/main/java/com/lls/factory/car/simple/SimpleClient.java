package com.lls.factory.car.simple;

public class SimpleClient {
    public static void main(String[] args) {
        /*
        AbstractCar abstractCar = new BenCar("奔驰", 15000.8);
        abstractCar.drive();
        */

        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        AbstractCar bmwCar = simpleCarFactory.createCar("宝马");
        bmwCar.drive();

        AbstractCar benCar = simpleCarFactory.createCar("奔驰");
        benCar.drive();
    }
}
