package com.sao.factory.car.factory;

import com.sao.factory.car.simple.AbstractCar;
import com.sao.factory.car.simple.BenCar;

public class BenCarFactory extends BaseCarFactory {

    @Override
    public AbstractCar createCar() {
        return new BenCar("奔驰", 120392.98);
    }

}
