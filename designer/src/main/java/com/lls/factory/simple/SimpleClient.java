package com.lls.factory.simple;

import com.lls.factory.before.Phone;

public class SimpleClient {
    public static void main(String[] args) {
        ApplePhoneFactory applePhoneFactory = new ApplePhoneFactory();
        Phone applePhone = applePhoneFactory.producePhone();
        applePhone.call();
        applePhone.playGame();

        MiPhoneFactory miPhoneFactory = new MiPhoneFactory();
        Phone miPhone = miPhoneFactory.producePhone();
        miPhone.call();
        miPhone.playGame();
    }
}
