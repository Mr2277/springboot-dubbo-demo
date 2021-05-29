package com.lls.factory.car.factory;

import com.lls.factory.car.simple.AbstractCar;
import com.lls.factory.car.simple.BmwCar;

public class BmwCarFactory extends BaseCarFactory {

    @Override
    public AbstractCar createCar() {
        return new BmwCar("宝马", 223434.98);
    }
}
