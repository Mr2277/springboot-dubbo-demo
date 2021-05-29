package com.lls.factory.car.absfactory;

import com.lls.factory.car.simple.AbstractCar;

public class BenCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return null;
    }

    @Override
    public AbstractCar createJeepCar() {
        return null;
    }

    @Override
    public AbstractCar createElecCar() {
        return null;
    }
}
