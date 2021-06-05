package com.sao.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubjectImpl implements WeatherSubject {

    private List<WeatherObserver> weatherObservers = new ArrayList<>();

    @Override
    public void attach(WeatherObserver weatherObserver) {
        this.weatherObservers.add(weatherObserver);
    }

    @Override
    public void detach(WeatherObserver weatherObserver) {
        this.weatherObservers.remove(weatherObserver);
    }

    @Override
    public void nofityObserver() {
        this.weatherObservers.stream().forEach(weatherObserver -> {
            weatherObserver.update();
            test(weatherObserver);
        });
    }

    private void test(WeatherObserver weatherObserver) {
        System.out.println();
    }

}
