package com.sao.observer.wechat;


public class ObserverA implements Observer {

    @Override
    public void update() {
        System.out.println("A--update");
    }

}
