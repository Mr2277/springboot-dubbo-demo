package com.sao.factory.car.factory;

import com.sao.factory.car.simple.AbstractCar;
import com.sao.factory.car.simple.BmwCar;

public class BmwCarFactory extends BaseCarFactory {

    @Override
    public AbstractCar createCar() {
        return new BmwCar("宝马", 223434.98);
    }
}
