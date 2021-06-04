package com.sao.observer;

public class ObserverClient {
    public static void main(String[] args) {
        WeChatSubject weChatSubject = new WeChatSubject();
        weChatSubject.addObserver(new ObserverA());
        weChatSubject.addObserver(new ObserverB());
        weChatSubject.notifyObserver();
    }
}
