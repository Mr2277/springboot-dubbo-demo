package com.sao.factory.phone.before;

public class MiNonSmartPhone implements Phone {

    public void call() {
        System.out.println("小米非智能手机call！");
    }

    public void playGame() {
        System.out.println("小米非智能手机playGame!");
    }
}
