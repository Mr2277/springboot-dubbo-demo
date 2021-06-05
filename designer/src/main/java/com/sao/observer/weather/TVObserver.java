package com.sao.observer.weather;

public class TVObserver implements WeatherObserver {

    @Override
    public void update() {
        System.out.println("电视观察天气");
    }

}
