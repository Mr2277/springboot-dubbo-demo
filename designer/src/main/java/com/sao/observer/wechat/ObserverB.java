package com.sao.observer.wechat;


public class ObserverB implements Observer {

    @Override
    public void update() {
        System.out.println("B--update");
    }

}
