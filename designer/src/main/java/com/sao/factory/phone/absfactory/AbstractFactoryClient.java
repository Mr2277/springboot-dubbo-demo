package com.sao.factory.phone.absfactory;

import com.sao.factory.phone.before.Phone;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractPhoneFactory abstractPhoneFactory = new AppleAbstractPhoneFactoryImpl();
        Phone phone = abstractPhoneFactory.produceNonSmartPhone();
        phone.call();
        phone.playGame();


    }
}
