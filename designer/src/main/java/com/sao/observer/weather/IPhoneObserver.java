package com.sao.observer.weather;

public class IPhoneObserver implements WeatherObserver {

    @Override
    public void update() {
        System.out.println("手机观察天气");
    }

}
