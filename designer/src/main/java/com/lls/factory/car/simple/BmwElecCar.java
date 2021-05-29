package com.lls.factory.car.simple;

public class BmwElecCar extends AbstractCar {

    public BmwElecCar(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void drive() {
        System.out.println(this.getBrand() + "drive");
    }
}
