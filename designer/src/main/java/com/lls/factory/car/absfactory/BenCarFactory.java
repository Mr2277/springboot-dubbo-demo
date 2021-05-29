package com.lls.factory.car.absfactory;

import com.lls.factory.car.simple.*;

public class BenCarFactory extends AbstractCarFactory {

    @Override
    public AbstractCar createCar() {
        return new BenCar("奔驰", 232334.98);
    }

    @Override
    public AbstractCar createJeepCar() {
        return new BenJeepCar("奔驰吉普", 43232.54);
    }

    @Override
    public AbstractCar createElecCar() {
        return new BenElecCar("奔驰电动", 34334.344);
    }
}
