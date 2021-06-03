package com.sao.factory.car.simple;

public abstract class AbstractCar {

    private String brand;

    private Double price;

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public AbstractCar(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }
}
