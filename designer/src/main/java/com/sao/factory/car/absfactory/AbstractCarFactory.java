package com.sao.factory.car.absfactory;

import com.sao.factory.car.simple.AbstractCar;

public abstract class AbstractCarFactory {

    public abstract AbstractCar createCar();

    public abstract AbstractCar createJeepCar();

    public abstract AbstractCar createElecCar();

}
