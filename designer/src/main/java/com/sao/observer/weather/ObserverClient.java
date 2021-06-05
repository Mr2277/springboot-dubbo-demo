package com.sao.observer.weather;

public class ObserverClient {
    public static void main(String[] args) {
        WeatherSubject subject = new WeatherSubjectImpl();
        subject.attach(new ComputerObserver());
        subject.attach(new TVObserver());
        subject.attach(new IPhoneObserver());
        subject.nofityObserver();
    }
}
