package com.sao.observer.weather;

public class ComputerObserver implements WeatherObserver {

    @Override
    public void update() {
        System.out.println("电脑观测天气");
    }

}
