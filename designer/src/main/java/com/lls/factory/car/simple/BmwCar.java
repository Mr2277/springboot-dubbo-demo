package com.lls.factory.car.simple;

public class BmwCar extends AbstractCar {

    public BmwCar(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void drive() {
        System.out.println(this.getBrand() + "drive");
    }
}
