package com.lls.factory.car.factory;

import com.lls.factory.car.simple.AbstractCar;
import com.lls.factory.car.simple.BenCar;

public class BenCarFactory extends BaseCarFactory {

    @Override
    public AbstractCar createCar() {
        return new BenCar("奔驰", 120392.98);
    }

}
