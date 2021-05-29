package com.lls.factory.car.simple;

public class BenCar extends AbstractCar {

    public BenCar(String brand, Double price) {
        super(brand, price);
    }

    public void drive() {
        System.out.println(this.getBrand() + "drive");
    }

}
