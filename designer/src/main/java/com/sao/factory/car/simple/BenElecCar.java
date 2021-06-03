package com.sao.factory.car.simple;

public class BenElecCar extends AbstractCar {

    public BenElecCar(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void drive() {
        System.out.println(this.getBrand() + "drive");
    }
}
