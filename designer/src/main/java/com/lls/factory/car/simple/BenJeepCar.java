package com.lls.factory.car.simple;

public class BenJeepCar extends AbstractCar {

    public BenJeepCar(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void drive() {
        System.out.println(this.getBrand() + "drive");    }
}
