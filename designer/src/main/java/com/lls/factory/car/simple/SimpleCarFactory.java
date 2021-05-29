package com.lls.factory.car.simple;

public class SimpleCarFactory {

    public AbstractCar createCar(String type) {
        AbstractCar abstractCar = null;
        switch (type) {
            case "奔驰":
                abstractCar = new BenCar("奔驰", 1234567.90);
                break;

            case "宝马":
                abstractCar = new BmwCar("宝马", 32456.78);
                break;

            default:
                break;
        }
        return abstractCar;
    }
}
