package com.lls.factory.phone.absfactory;

import com.lls.factory.phone.before.Phone;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractPhoneFactory abstractPhoneFactory = new AppleAbstractPhoneFactoryImpl();
        Phone phone = abstractPhoneFactory.produceNonSmartPhone();
        phone.call();
        phone.playGame();


    }
}
