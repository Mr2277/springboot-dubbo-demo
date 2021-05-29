package com.lls.factory.phone.before;

public class BeforeClient {

    public static Phone producePhone(String type) {
        if ("苹果" == type) {
            return new ApplePhone();
        } else {
            return new MiPhone();
        }
    }

    public static void main(String[] args) {
        Phone phone = BeforeClient.producePhone("小米");
        phone.call();
        phone.playGame();
    }

}
