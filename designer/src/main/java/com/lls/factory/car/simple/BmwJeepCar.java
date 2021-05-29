package com.lls.factory.car.simple;

public class BmwJeepCar extends AbstractCar {

    public BmwJeepCar(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void drive() {
        System.out.println(this.getBrand() + "drive");
    }
}
