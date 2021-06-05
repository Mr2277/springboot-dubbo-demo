package com.sao.observer.wechat;


import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
