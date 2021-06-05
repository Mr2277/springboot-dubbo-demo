package com.sao.observer.weather;

public interface WeatherSubject {

    void attach(WeatherObserver weatherObserver);

    void detach(WeatherObserver weatherObserver);

    void nofityObserver();

}
